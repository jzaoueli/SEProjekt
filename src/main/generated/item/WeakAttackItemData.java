package main.generated.item;

import main.model.Item;

/**
 * Created by Pi on 04.07.2016.
 */
public class WeakAttackItemData extends Item{

    private String fileName = "i_weakattack.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String effect = "lifepoints";

    public Object[] getWeakAttackItemData(){
        return new Object[]{fileName, numberLine, numberColumn, width, height, effect};
    }
}
