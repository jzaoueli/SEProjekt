package main.generated.item;

import main.model.Item;
/**
 * creation : 2016/07/13 22:26
 */
public class HealItemData extends Item {

    private String fileName = "iheal.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String effect = "lifepoints";

    public Object[] getHealItemData() {
        return new Object[]{fileName, numberLine, numberColumn, width, height, effect};
    }

}