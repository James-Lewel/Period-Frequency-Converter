package com.example.periodfrequencyconverter;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField secondsInput;
    @FXML
    private TextField millisecondsInput;
    @FXML
    private TextField microsecondsInput;
    @FXML
    private TextField nanosecondsInput;
    @FXML
    private TextField picosecondsInput;
    @FXML
    private TextField hertzInput;
    @FXML
    private TextField kilohertzInput;
    @FXML
    private TextField megahertzInput;
    @FXML
    private TextField gigahertzInput;
    @FXML
    private TextField terahertzInput;

    @FXML
    protected void secondsInputOnKeyReleased() {
        String secondsValue = secondsInput.getText();
        if (isValidNumber(secondsValue)) {
            secondsToHertz(secondsValue);
        } else {
            clearFrequencyFields();
        }
    }

    @FXML
    protected void millisecondsInputOnKeyReleased() {
        String millisecondsValue = millisecondsInput.getText();
        if (isValidNumber(millisecondsValue)) {
            millisecondsToKilohertz(millisecondsValue);
        } else {
            clearFrequencyFields();
        }
    }

    @FXML
    protected void microsecondsInputOnKeyReleased() {
        String microsecondsValue = microsecondsInput.getText();
        if (isValidNumber(microsecondsValue)) {
            microsecondsToMegahertz(microsecondsValue);
        } else {
            clearFrequencyFields();
        }
    }

    @FXML
    protected void nanosecondsInputOnKeyReleased() {
        String nanosecondsValue = nanosecondsInput.getText();
        if (isValidNumber(nanosecondsValue)) {
            nanosecondsToGigahertz(nanosecondsValue);
        } else {
            clearFrequencyFields();
        }
    }

    @FXML
    protected void picosecondsInputOnKeyReleased() {
        String picosecondsValue = picosecondsInput.getText();
        if (isValidNumber(picosecondsValue)) {
            picosecondsToTerahertz(picosecondsValue);
        } else {
            clearFrequencyFields();
        }
    }

    @FXML
    protected void hertzInputOnKeyReleased() {
        String hertzValue = hertzInput.getText();
        if (isValidNumber(hertzValue)) {
            hertzToSeconds(hertzValue);
        } else {
            clearTimeFields();
        }
    }

    @FXML
    protected void kilohertzInputOnKeyReleased() {
        String kilohertzValue = kilohertzInput.getText();
        if (isValidNumber(kilohertzValue)) {
            kilohertzToMilliseconds(kilohertzValue);
        } else {
            clearTimeFields();
        }
    }

    @FXML
    protected void megahertzInputOnKeyReleased() {
        String megahertzValue = megahertzInput.getText();
        if (isValidNumber(megahertzValue)) {
            megahertzToMicroseconds(megahertzValue);
        } else {
            clearTimeFields();
        }
    }

    @FXML
    protected void gigahertzInputOnKeyReleased() {
        String gigahertzValue = gigahertzInput.getText();
        if (isValidNumber(gigahertzValue)) {
            gigahertzToNanoseconds(gigahertzValue);
        } else {
            clearTimeFields();
        }
    }

    @FXML
    protected void terahertzInputOnKeyReleased() {
        String terahertzValue = terahertzInput.getText();
        if (isValidNumber(terahertzValue)) {
            terahertzToPicoseconds(terahertzValue);
        } else {
            clearTimeFields();
        }
    }

    @FXML
    protected void clearFrequencyFields() {
        hertzInput.clear();
        kilohertzInput.clear();
        megahertzInput.clear();
        gigahertzInput.clear();
        terahertzInput.clear();
    }

    @FXML
    protected void clearTimeFields() {
        secondsInput.clear();
        millisecondsInput.clear();
        microsecondsInput.clear();
        nanosecondsInput.clear();
        picosecondsInput.clear();
    }

    private boolean isValidNumber(String value) {
        return value.matches("[-+]?\\d*\\.?\\d+");
    }

    private void secondsToHertz(String secondsValue) {
        try {
            double seconds = Double.parseDouble(secondsValue);
            double hertz = 1 / seconds;
            hertzInput.setText(Double.toString(hertz));
        } catch (NumberFormatException e) {
        }
    }

    private void millisecondsToKilohertz(String millisecondsValue) {
        try {
            double milliseconds = Double.parseDouble(millisecondsValue);
            double kilohertz = 1 / (milliseconds * 1e-3);
            kilohertzInput.setText(Double.toString(kilohertz));
        } catch (NumberFormatException e) {
        }
    }

    private void microsecondsToMegahertz(String microsecondsValue) {
        try {
            double microseconds = Double.parseDouble(microsecondsValue);
            double megahertz = 1 / (microseconds * 1e-6);
            megahertzInput.setText(Double.toString(megahertz));
        } catch (NumberFormatException e) {
        }
    }

    private void nanosecondsToGigahertz(String nanosecondsValue) {
        try {
            double nanoseconds = Double.parseDouble(nanosecondsValue);
            double gigahertz = 1 / (nanoseconds * 1e-9);
            gigahertzInput.setText(Double.toString(gigahertz));
        } catch (NumberFormatException e) {
        }
    }

    private void picosecondsToTerahertz(String picosecondsValue) {
        try {
            double picoseconds = Double.parseDouble(picosecondsValue);
            double terahertz = 1 / (picoseconds * 1e-12);
            terahertzInput.setText(Double.toString(terahertz));
        } catch (NumberFormatException e) {
        }
    }

    private void hertzToSeconds(String hertzValue) {
        try {
            double hertz = Double.parseDouble(hertzValue);
            double seconds = 1 / hertz;
            secondsInput.setText(Double.toString(seconds));
        } catch (NumberFormatException e) {
        }
    }

    private void kilohertzToMilliseconds(String kilohertzValue) {
        try {
            double kilohertz = Double.parseDouble(kilohertzValue);
            double milliseconds = 1 / (kilohertz * 1e3);
            millisecondsInput.setText(Double.toString(milliseconds));
        } catch (NumberFormatException e) {
        }
    }

    private void megahertzToMicroseconds(String megahertzValue) {
        try {
            double megahertz = Double.parseDouble(megahertzValue);
            double microseconds = 1 / (megahertz * 1e6);
            microsecondsInput.setText(Double.toString(microseconds));
        } catch (NumberFormatException e) {
        }
    }

    private void gigahertzToNanoseconds(String gigahertzValue) {
        try {
            double gigahertz = Double.parseDouble(gigahertzValue);
            double nanoseconds = 1 / (gigahertz * 1e9);
            nanosecondsInput.setText(Double.toString(nanoseconds));
        } catch (NumberFormatException e) {
        }
    }

    private void terahertzToPicoseconds(String terahertzValue) {
        try {
            double terahertz = Double.parseDouble(terahertzValue);
            double picoseconds = 1 / (terahertz * 1e12);
            picosecondsInput.setText(Double.toString(picoseconds));
        } catch (NumberFormatException e) {
        }
    }

}
