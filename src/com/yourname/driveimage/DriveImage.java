package com.yourname.driveimage;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

@DesignerComponent(
    version = 1,
    description = "Google Drive Image Loader",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "")

@SimpleObject(external = true)
public class DriveImage extends AndroidNonvisibleComponent {

    public DriveImage(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Convert Google Drive File ID to Direct URL")
    public String GetImageUrl(String fileId) {
        return "https://drive.google.com/uc?export=view&id=" + fileId;
    }
}
