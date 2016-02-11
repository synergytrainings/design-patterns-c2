package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/11/2016.
 */
public class InsertStringCommand implements Command{
    private Document document;
    private String str;
    private int position;
    public InsertStringCommand(Document document, String str, int position) {
        this.document= document;
        this.str= str;
        this.position = position;
    }
    @Override
    public void execute() {
        document.insertString(str, position);
        document.output("Insert string ("+ str+")to position "+ position);
    }
}
