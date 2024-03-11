package br.com.murilo.restwithspringbootandjava.controllers;
import br.com.murilo.restwithspringbootandjava.exceptions.UnsupportedMathOperationException;
import br.com.murilo.restwithspringbootandjava.math.SimpleMath;
import org.springframework.web.bind.annotation.*;
import java.lang.Math;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.murilo.restwithspringbootandjava.converters.NumberConverter.convertToDouble;
import static br.com.murilo.restwithspringbootandjava.converters.NumberConverter.isNumeric;

@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/diff/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double diff(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.diff(convertToDouble(numberOne), convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.mult(convertToDouble(numberOne), convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.div(convertToDouble(numberOne), convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double avg(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.avg(convertToDouble(numberOne), convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/sqrt/{number}", method = RequestMethod.GET)
    public Double sqrt(
            @PathVariable(value = "number") String number
            ) throws Exception {
        if(!isNumeric(number)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.sqrt(convertToDouble(number));
    }

}
