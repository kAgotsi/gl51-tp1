package gl51.tp1.service.image.impl

import gl51.tp1.data.Image
import gl51.tp1.service.image.CloudService
import gl51.tp1.service.image.FiligrameService
import gl51.tp1.service.image.ImageService
import gl51.tp1.service.image.UploadImageService

import javax.inject.Inject

class UploadImageImpl implements UploadImageService{

    @Inject
    ResizerImpl resizerService

    @Inject
    CloudService cloudService

    @Inject
    ImageService imageService

    @Inject
    FiligrameService filigrammeService;

    @Override
    boolean upload() {
        try{
         Image image = imageService.fetch();
        //Resize
        Image resizedImage = resizerService.resize(image,1024,1024)
        Image thumbnail = resizerService.resize(image,50,50)

            //Generate logo
         logo = filigrammeService.add(thumbnail)

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
