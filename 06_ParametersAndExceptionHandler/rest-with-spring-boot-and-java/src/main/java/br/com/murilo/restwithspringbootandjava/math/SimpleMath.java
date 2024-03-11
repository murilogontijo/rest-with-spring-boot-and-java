package br.com.murilo.restwithspringbootandjava.math;

import br.com.murilo.restwithspringbootandjava.exceptions.UnsupportedMathOperationException;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo
    ) {
        return numberOne + numberTwo;
    }
    public Double diff(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }
    public Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }
    public Double div(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }
    public Double avg(Double numberOne,Double numberTwo)  {
        return (numberOne + numberTwo)/2;
    }
    public Double sqrt( Double number){
        return Math.sqrt(number);
    }
}
