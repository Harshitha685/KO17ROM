package com.xworkz.tasks.camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.cameraName();
        camera.qualityInfo();


        MobileCamera mobileCamera = new MobileCamera();
        mobileCamera.cameraName();
        mobileCamera.qualityInfo();
    }
}
