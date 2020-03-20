package Noodles;

import android.widget.ImageView;

public class Noodles {
    private String name;
    private String recommend;//推荐指数
    private int imageId;

    public Noodles(String name, String recommend, int imageId) {
        this.name = name;
        this.recommend = recommend;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getRecommend() {
        return recommend;
    }

    public int getImageId() {
        return imageId;
    }

}
