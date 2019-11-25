package invoke.ocr.ocr.models;

import java.util.Date;

public class OcrResponse {
    private String output;
    private String timestamp;

    public OcrResponse(String output, String timestamp) {
        this.output = output;
        this.timestamp = timestamp;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
