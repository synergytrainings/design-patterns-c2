package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/11/2016.
 */
public class AddStringBegin implements Command {
    private Document document;
    private String str;
    public AddStringBegin(Document document, String str) {
        this.document= document;
        this.str= str;
    }
    @Override
    public void execute() {
        document.addStringBefore(str);
        document.output("Add string ("+str+") before document");
    }
}