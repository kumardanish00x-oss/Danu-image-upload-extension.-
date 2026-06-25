package com.yourname.driveimage;

public class DriveImage {

    public static String GetImageUrl(String fileId) {
        return "https://drive.google.com/uc?export=view&id=" + fileId;
    }
}
