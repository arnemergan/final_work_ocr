package invoke.ocr.ocr.controllers;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import invoke.ocr.ocr.models.OcrRequest;
import invoke.ocr.ocr.models.OcrResponse;
import net.sourceforge.tess4j.util.LoadLibs;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@RestController
@RequestMapping(path = "ocr")
public class ControllerOcr {
    @PostMapping(path = {"/",""})
    public ResponseEntity<OcrResponse> GetInvoiceData(@ModelAttribute("image") MultipartFile  image, @ModelAttribute("lang") String Language){
            OcrRequest request = new OcrRequest(image,Language);
            ITesseract instance = new Tesseract();
            Date timestamp = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            File file = convert(request.getImage());
            if(file == null)
                return ResponseEntity.status(400).body(new OcrResponse("Image must be filled in!",formatter.format(timestamp)));
            instance.setLanguage(request.getLanguage());
            instance.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
            String result = instance.doOCR(file);
            return ResponseEntity.status(200).body(new OcrResponse(result,formatter.format(timestamp)));

        } catch (TesseractException | IOException e) {
            System.err.println(e.getMessage());
            return ResponseEntity.status(400).body(new OcrResponse("Error while reading!",formatter.format(timestamp)));
        }
    }

    public static File convert(MultipartFile file) throws IOException {
        if(file == null){
            return null;
        }
        File convFile = new File(file.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
