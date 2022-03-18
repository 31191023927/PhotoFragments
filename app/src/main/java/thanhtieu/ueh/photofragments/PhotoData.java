package thanhtieu.ueh.photofragments;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 2,
                "https://i.pinimg.com/736x/34/c3/56/34c356a260678adcd80b56b4b4bb6be8.jpg"));
        photos.add(new Photo(1, 2,
                "https://i.pinimg.com/564x/ed/f3/1a/edf31a2ae78627dcf911f2279b6ca323.jpg"));
        photos.add(new Photo(2, 2,
                "https://i.pinimg.com/564x/d5/61/46/d561465729fc44213a3b5b0cd1ebb83c.jpg"));
        photos.add(new Photo(3, 1,
                "https://i.pinimg.com/564x/4d/93/d3/4d93d3c41d690499dcf3d031be2765e9.jpg"));
        photos.add(new Photo(4, 1,
                "https://i.pinimg.com/564x/f5/66/67/f566673a120af2a87d77b80428acbd11.jpg"));
        photos.add(new Photo(5, 1,
                "https://i.pinimg.com/564x/e0/e5/16/e0e516387be854286b854696905a1cad.jpg"));
        photos.add(new Photo(6, 0,
                "https://i.pinimg.com/564x/4a/33/f0/4a33f0b5031cb72f6e1c8fb141324d7c.jpg"));
        photos.add(new Photo(7, 0,
                "https://i.pinimg.com/736x/9b/cb/fa/9bcbfa8d21879be651e084f5d00207f9.jpgg"));
        photos.add(new Photo(8, 0,
                "https://i.pinimg.com/564x/77/1e/8c/771e8c1997ac1ccb7a3f022e5c3f4d6f.jpg"));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for(int i = 0; i < phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Photo> getPhotosByCategory(int category){
        ArrayList<Photo> allPhotos = generatePhotoData();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for(int i = 0; i < allPhotos.size(); i++){
            if(allPhotos.get(i).getCategory() == category){
                photos.add(allPhotos.get(i));
            }
        }
        return photos;
    }
}
