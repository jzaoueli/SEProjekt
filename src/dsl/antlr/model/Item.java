package dsl.antlr.model;

import com.sun.istack.internal.Nullable;

import static java.util.Objects.isNull;

/**
 * creation : 2016/07/07 16:47
 */
public class Item {

    private String itemName;
    private String fileName;
    private int numberLine;
    private int numberColumn;
    private int width;
    private int height;
    private String effect;

    /**
     * Constructor with parameters
     */
    public Item(@Nullable String itemName, String fileName, int numberLine, int numberColumn, int width, int height, String effec) {
        if(isNull(itemName)){
            itemName = "AutoName";
        }
        this.itemName = itemName;
        this.fileName = fileName;
        this.numberLine = numberLine;
        this.numberColumn = numberColumn;
        this.width = width;
        this.height = height;
        this.effect = effec;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumberLine() {
        return numberLine;
    }

    public int getNumberColumn() {
        return numberColumn;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getEffect() {
        return effect;
    }

    public String getItemName() {
        return itemName;
    }
}