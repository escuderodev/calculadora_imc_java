package br.com.escuderodev.dto;

import java.text.DecimalFormat;

public class CalculadoraIMC {

    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String calculaIMC(double weight, double height) {
        double imc = 0;
        imc = weight / (height * height);
        return validaIMC(imc);
    }

    public String validaIMC(double imc) {
        if (imc < 18.5) {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está abaixo do peso.";
        } else if (imc > 18.5 && imc < 25.0) {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está no peso ideal.";
        } else if (imc >= 25.0 && imc < 30.0) {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está acima do peso.";
        } else if (imc >= 30.0 && imc < 35.0) {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está com Obesidade Classe I.";
        } else if (imc >= 35.0 && imc < 40.0) {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está com Obesidade Classe II.";
        } else {
            return "Seu IMC é " + new DecimalFormat(".##").format(imc) + " e você está com Obesidade Classe III.";
        }
    }
}
