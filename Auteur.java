
public class Auteur {
    private String nom;
    private int perfTragedie;
    private int perfComedie;
    private int perfDrame;
    private String citationTragedie;
    private String citationComedie;
    private String citationDrame;

    public Auteur(String nom, int tragedie,String citationTragedie, int comedie, String citationComedie, int drame, String citationDrame) {
        this.nom = nom;
        this.perfTragedie = tragedie;
        this.perfComedie = comedie;
        this.perfDrame = drame;
        this.citationTragedie = citationTragedie;
        this.citationComedie = citationComedie;
        this.citationDrame = citationDrame;
    }
    public int getQualitéTragédie(){
        return this.perfTragedie;
    }

    public String getCitationTragédie(){
        return this.citationTragedie;
    }

    public int getQualitéComédie(){
        return this.perfComedie;
    }

    public String getCitationComédie(){
        return this.citationComedie;
    }

    public int getQualitéDrame(){
        return this.perfDrame;
    }

    public String getCitationDrame(){
        return  this.citationDrame;
    }

    public String getMeilleurCitation(){
        int maxQualite = Math.max(Math.max(perfTragedie,perfComedie),perfDrame);

        if(maxQualite == perfTragedie){
            return "Tragédie";
        }
        if (maxQualite == perfComedie){
            return "Comédie";
        }
        if (maxQualite == perfDrame){
            return "Drame";
        }
        return "";
    }
@Override
    public String toString(){
        String s1 = "L'honorable";
        return s1.concat(this.nom);
    }

    public String pointFort(){
        int pointFort = 0;
        String nom_fort = null;
        if (this.perfTragedie > pointFort){
            pointFort = this.perfTragedie;
            nom_fort = "Tragédie";
        }
        if (this.perfComedie > pointFort){
            pointFort = this.perfComedie;
            nom_fort = "Comédie";
        }
        if (this.perfDrame > pointFort){
            pointFort = this.perfDrame;
            nom_fort = "Drame";
        }
        return nom_fort;
    }

    public int qualiteStyle(Style s){
        if(s.equals(Style.DRAME)){
            return this.perfDrame;
        }
        else if(s.equals(Style.TRAGÉDIE)){
            return this.perfTragedie;
        }
        else{
            return this.perfDrame;
        }
    }

    public String citationStyle(Style s){
        if(s.equals(Style.DRAME)){
            return this.citationDrame;
        }
        else if(s.equals(Style.TRAGÉDIE)){
            return this.citationTragedie;
        }
        else{
            return this.citationComedie;
        }
    }
}
