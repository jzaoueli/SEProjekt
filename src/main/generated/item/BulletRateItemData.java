package main.generated.item;

import main.model.Item;

/**
 * Created by Pi on 04.07.2016.
 */
public class BulletRateItemData extends Item {

    private String fileName = "i_bulletrateincrease.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String effect = "bulletrate";

    public Object[] getBulletRateItemData(){
        return new Object[]{fileName, numberLine, numberColumn, width, height, effect};
    }
}
