package com.xworkz.tasks.camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.cameraName();
        camera.qualityInfo();
        camera.capturePhoto();
        camera.zoomIn();
        camera.zoomOut();

        Camera camera2 = new MobileCamera();
        camera2.cameraName();
        camera2.qualityInfo();
        camera2.capturePhoto();
        camera2.zoomIn();
        camera2.zoomOut();


        MobileCamera mobileCamera = new MobileCamera();
        mobileCamera.applyFilter();
        mobileCamera.enablePortraitMode();
        mobileCamera.enableHDR();
        mobileCamera.connectToCloud();
        mobileCamera.useFaceDetection();

        Camera camera1 = new MobileCamera();

        MobileCamera mobileCamera1 = (MobileCamera) camera1;
        System.out.println(mobileCamera1);
    }
}
