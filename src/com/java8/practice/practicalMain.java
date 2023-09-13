package com.java8.practice;

import java.util.List;
import java.util.stream.Collectors;

 class Practical {
    private static Center center;
    private String scale;
    private String pen;
    private String pencil;
    private int whitePapers;

     public Center getCenter() {
         return center;
     }

     public void setCenter(Center center) {
         this.center = center;
     }

     public Practical(String scale, String pen, String pencil, int whitePapers, Center center) {
        this.scale = scale;
        this.pen = pen;
        this.pencil = pencil;
        this.whitePapers = whitePapers;
        this.center = center;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getPen() {
        return pen;
    }

    public void setPen(String pen) {
        this.pen = pen;
    }

    public String getPencil() {
        return pencil;
    }

    public void setPencil(String pencil) {
        this.pencil = pencil;
    }

    public int getWhitePapers() {
        return whitePapers;
    }

    public void setWhitePapers(int whitePapers) {
        this.whitePapers = whitePapers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("details  {\n");
        sb.append("    scale: ").append(scale).append("\n");
        sb.append("    Center: ").append(center).append("\n");
        sb.append("    pen: ").append(this.pen).append("\n");
        sb.append("    pencil: ").append((this.pencil)).append("\n");
        sb.append("    whitepapers: ").append(this.whitePapers).append("\n");
        sb.append("}");
        return sb.toString();
    }

    enum Center {
        GOVT_SCHOOL, RESEDENTIAL
    }
}

public class practicalMain {
    public static void main(String[] args) {
        List<Practical> practicals = List.of(new Practical("30mm", "Blue pen", "2mm", 10, Practical.Center.RESEDENTIAL),
                new Practical("50mm", "Blue pen", "1.5mm", 10, Practical.Center.RESEDENTIAL),
                new Practical("50mm", "Black pen", "1.5mm", 10, Practical.Center.RESEDENTIAL),
                new Practical("30mm", "Blue pen", "1.5mm", 15, Practical.Center.RESEDENTIAL),
                new Practical("15mm", "Black pen", "2.5mm", 20, Practical.Center.GOVT_SCHOOL));

      practicals.stream().filter(practical ->practical.getPen().equals("Black pen")).forEach(System.out::println);
        practicals.stream().filter(practical ->practical.getPen().equals("Blue pen")).forEach(System.out::println);


        /*practicals.stream().filter(practicalss ->practicalss.getCenter().equals(Practical.Center.RESEDENTIAL)).
                collect(Collectors.toList()).forEach(System.out::println);*/



    }

}

