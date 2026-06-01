package org.example.app

class Fecha (
private var dia: Int,
private var mes: Int,
private var ano: Int) {
    override fun toString():String {
        return "La fecha de hoy es: $dia/$mes/$ano"
    }
}
