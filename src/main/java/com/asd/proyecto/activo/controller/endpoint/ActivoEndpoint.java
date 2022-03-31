package com.asd.proyecto.activo.controller.endpoint;

public class ActivoEndpoint {

    public static final String ACTIVO_ENDPOINT = "activo";
    public static final String GET_ACTIVOS_BY_DATE = "/date/{date}";
    public static final String GET_ACTIVO_BY_SERIAL = "/serial/{serial}";
    public static final String INMUEBLE_ENDPOINT = ACTIVO_ENDPOINT + "/inmueble";
    public static final String MAQUINARIA_ENDPOINT = ACTIVO_ENDPOINT + "/maquinaria";


}
