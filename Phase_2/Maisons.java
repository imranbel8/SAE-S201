import java.util.ArrayList;
import ardoise.*

public class Maisons extends Forme{
    private Triangles toit;
    private Quadrilateres corps;
    private Quadrilateres porte;

    public Maisons() {
        super();
    }

    public Maisons(Triangles t, Quadrilateres c, Quadrilateres p) {
        this.toit = t;
        this.corps = c;
        this.porte = p;
        this.setNomForme("Maison");
    }

    public Triangles getToit() {
        return this.toit;
    }

    public Quadrilateres getCorps() {
        return this.corps;
    }

    public Quadrilateres getPorte() {
        return this.porte;
    }
    
    public void setToit(Triangles t) {
        this.toit = t;
    }

    public void setCorps(Quadrilateres c) {
        this.corps = c;
    }

    public void setPorte(Quadrilateres p) {
        this.porte = p;
    }

    @Override
    public void deplacer(int x, int y) {

    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> s1 = new ArrayList<Segment>(this.toit.dessiner());
        ArrayList<Segment> s2 = new ArrayList<Segment>(this.corps.dessiner());
        ArrayList<Segment> s3 = new ArrayList<Segment>(this.porte.dessiner());

        ArrayList<Segment> s = new ArrayList<Segment>();

        for(int i = 0; i<s1.size(); i++) {
            s.add(s1.get(i));
        }

        for(int i = 0; i<s2.size(); i++) {
            s.add(s2.get(i));
        }

        for(int i = 0; i<s3.size(); i++) {
            s.add(s3.get(i));
        }

        return s;
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    public String toString() {
        return "Maison : [ Toit = " + this.getToit() + ", Corps = " + this.getCorps() + ", Porte = " + this.getPorte() + " ]";
    }
}
