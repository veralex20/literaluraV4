package com.example.literaluraV4.mapper;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
