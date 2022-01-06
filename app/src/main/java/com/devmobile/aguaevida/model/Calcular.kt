package com.devmobile.aguaevida.model

class Calcular {

    private val ml_jovem = 40.0
    private val ml_adulto =35.0
    private val ml_idoso = 30.0
    private val ml_mais_de_66 = 25.0

    private var resultadoMl = 0.0
    protected var resultado_total_ml = 0.0

    fun calcularTotalMl(peso: Double, idade: Int){

        if(idade <= 17){
            resultadoMl = peso * ml_jovem
            resultado_total_ml = resultadoMl
        }else if(idade <= 55){
            resultadoMl = peso * ml_adulto
            resultado_total_ml = resultadoMl
        }else if (idade <=65){
            resultadoMl = peso * ml_idoso
            resultado_total_ml = resultadoMl
        }else {
            resultadoMl = peso * ml_mais_de_66
            resultado_total_ml = resultadoMl
        }

    }

    fun ResultadoMl(): Double{
        return resultado_total_ml
    }
}