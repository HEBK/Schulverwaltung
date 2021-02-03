package eu.flrkv.schoolmanagement;

import java.util.HashMap;

public class Language {

    private HashMap<String, String> language;

    // Languages
    private HashMap<String, String> german = new HashMap<String, String>();
    private HashMap<String, String> english = new HashMap<String, String>();

    public Language() {
    }


    private void setLanguage(int ID)
    {
        if (ID >= 1 && ID <= 2) {
        if (ID == 1) {
            this.language = this.german;
        } else {
            this.language = this.english;
        }
    }
        System.out.println("FATAL ERROR: Unable to load language with ID " + ID + ". Execution stopped!");
        System.exit(-1);
    }

    public void initGerman()
    {

    }

    public void initEnglish()
    {

    }
}
