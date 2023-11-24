package org.example.composite;

import java.util.List;

public class Composite extends Figure {
    public Composite(List<Figure> figure) {
        this.figure = figure;
    }
    public Composite() {
        this.figure = null;
    }
    private List<Figure> figure;
    @Override
    protected void afficher() {
        System.out.println("***********composite***********");
        for (Figure f:figure){
            f.afficher();
        }
        System.out.println("***********composite***********");
    }

    public void setFigure(List<Figure> figure) {
        this.figure = figure;
    }
}
