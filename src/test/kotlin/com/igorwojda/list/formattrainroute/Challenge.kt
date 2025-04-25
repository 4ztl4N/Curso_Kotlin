package com.igorwojda.list.formattrainroute

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun formatTrainRoute(stations: List<String>): String {
    /*var inicio = "Train is calling at"
    for (index in stations.indices) {
        val estacion = stations[index]
        when (index) {
            0 -> inicio += " $estacion"
            stations.size-1 -> inicio += " and $estacion"
            else -> inicio += ", $estacion"
        }
    }
    println(inicio)
    return inicio*/

    /*var inicio = "Train is calling at"
    for (index in stations.indices) {
        when (index) {
            0 -> inicio = inicio + " " + stations[index]
            stations.size - 1 -> inicio = inicio + " and " + stations[index]
            else -> inicio = inicio + ", " + stations[index]
        }
    }
    println(inicio)
    return inicio*/

    var inicio = "Train is calling at"
    for (estacion in stations) {
        val indexOf = stations.indexOf(estacion)
        if (indexOf == 0) {
            inicio = "$inicio $estacion"
        } else if (indexOf == stations.size - 1) {
            inicio = "$inicio and $estacion"
        } else {
            inicio = "$inicio, $estacion"
        }
    }
    println(inicio)
    return inicio
}

private class Test {
    @Test
    fun `formatTrainRoute list 'Luton'`() {
        formatTrainRoute(listOf("Luton")) shouldBeEqualTo "Train is calling at Luton"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden'`() {
        formatTrainRoute(listOf("Luton", "Harpenden")) shouldBeEqualTo "Train is calling at Luton and Harpenden"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'London'`() {
        val list = listOf("Luton", "Harpenden", "London")
        formatTrainRoute(list) shouldBeEqualTo "Train is calling at Luton, Harpenden and London"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'St Albans', 'London'`() {
        val list = listOf("Luton", "Harpenden", "St Albans", "London")
        formatTrainRoute(list) shouldBeEqualTo "Train is calling at Luton, Harpenden, St Albans and London"
    }
}
