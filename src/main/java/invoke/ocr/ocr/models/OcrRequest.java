package invoke.ocr.ocr.models;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class OcrRequest {
    private MultipartFile  Image;
    private String Language;

    public OcrRequest(MultipartFile  image, String language) {
        Image = image;
        Language = language;
    }

    public MultipartFile  getImage() {
        return Image;
    }

    public void setImage(MultipartFile  image) {
        Image = image;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }
}
