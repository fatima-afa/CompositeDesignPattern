package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {
        List<Figure> figures=new ArrayList<>();
        Figure figure;
        figure=new Cercle();
        figures.add(figure);
        figure.afficher();
        figure=new Rectangle();
        figures.add(figure);
        figure.afficher();
        figure=new Composite(figures);
        figure.afficher();



    }
}
