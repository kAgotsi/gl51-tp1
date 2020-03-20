package gl51.tp1.service.image.impl

import gl51.tp1.data.Image
import gl51.tp1.service.image.ImageService
import gl51.tp1.service.image.UploadImageService

import javax.inject.Inject

class UploadImageImpl implements UploadImageService{

    @Inject
    ResizerImpl resizerService

    @Inject
    CloudServiceImpl cloudService

    @Inject
    ImageService imageService

    @Override
    boolean upload() {
        try{
        //Resize
        Image resizedImage = resizerService.resize(1024,1024)
        Image thumbnail = resizerService.resize(50,50)

        //save two image on cloud
        cloudService.save(resizedImage);
        cloudService.save(thumbnail);

        //update local database
        imageService.update(resizedImage)
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
