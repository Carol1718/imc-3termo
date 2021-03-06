package br.senai.sp.jandira.imcapp20_a.model

import java.time.LocalDate
import java.util.Arrays.toString

data class Biometria (
    var id: Int = 0,
    var peso: Double = 0.0,
    var nivelAtiviade: String,
    var dataPesagem: String = LocalDate.now().toString(),
    var usuario: Int = 0
)
