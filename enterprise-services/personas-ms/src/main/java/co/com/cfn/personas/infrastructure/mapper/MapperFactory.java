package co.com.cfn.personas.infrastructure.mapper;


import co.com.cfn.foundation.framework.components.builder.Mapper;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * Cibercolegios Generic Artifact
 * Created: 4-Ene-2017
 * Author: Administrator
 * Type: JAVA class Artifact
 * Purpose:Mapper factory artifact
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

public class MapperFactory {

    public static final String PERSONA_DTO_TO_ENTITY = "PERSONA_DTO_TO_ENTITY";
    public static final String PERSONA_ENTITY_TO_DTO = "PERSONA_ENTITY_TO_DTO";

    public static final String TIPOIDENTIFICACION_DTO_TO_ENTITY = "TIPOIDENTIFICACION_DTO_TO_ENTITY";
    public static final String TIPOIDENTIFICACION_ENTITY_TO_DTO = "TIPOIDENTIFICACION_ENTITY_TO_DTO";

    public static final String TIPODOCUMENTAL_DTO_TO_ENTITY = "TIPODOCUMENTAL_DTO_TO_ENTITY";
    public static final String TIPODOCUMENTAL_ENTITY_TO_DTO = "TIPODOCUMENTAL_ENTITY_TO_DTO";

    public static final String TIPOTRAMITE_DTO_TO_ENTITY = "TIPOTRAMITE_DTO_TO_ENTITY";
    public static final String TIPOTRAMITE_ENTITY_TO_DTO = "TIPOTRAMITE_ENTITY_TO_DTO";

    public static final String ESTADOCIVIL_DTO_TO_ENTITY = "ESTADOCIVIL_DTO_TO_ENTITY";
    public static final String ESTADOCICIL_ENTITY_TO_DTO = "ESTADOCICIL_ENTITY_TO_DTO";

    public static final String GENERO_DTO_TO_ENTITY ="GENERO_DTO_TO_ENTITY";
    public static final String GENERO_ENTITY_TO_DTO = "GENERO_ENTITY_TO_DTO";

    public static final String NACIONALIDAD_ENTITY_TO_DTO = "NACIONALIDAD_ENTITY_TO_DTO";

    public static final String NIVELESTUDIO_ENTITY_TO_DTO = "NIVELESTUDIO_ENTITY_TO_DTO";

    public static final String PROFESION_ENTITY_TO_DTO = "PROFESION_ENTITY_TO_DTO";

    public static final String GRUPOETNICO_DTO_TO_ENTITY = "GRUPOETNICO_DTO_TO_ENTITY";

    public static final String DESTINOECONOMICO_ENTITY_TO_DTO = "DESTINOECONOMICO_ENTITY_TO_DTO";

    public static final String DESTINOFINANCIERO_ENTITY_TO_DTO = "DESTINOFINANCIERO_ENTITY_TO_DTO";

    public static final String OTROPRODUCTO_ENTITY_TO_DTO = "OTROPRODUCTO_ENTITY_TO_DTO";

    public static final String OFICINA_ENTITY_TO_DTO = "OFICINA_ENTITY_TO_DTO";

    public static final String PROVINCIA_ENTITY_TO_DTO = "PROVINCIA_ENTITY_TO_DTO";

    public static final String PERIODICIDAD_ENTITY_TO_DTO = "PERIODICIDAD_ENTITY_TO_DTO";


    private static MapperFactory INSTANCE = new MapperFactory();

    // [constructor]------------------------------

    private MapperFactory() {
    }

    public static MapperFactory getInstance() {
        return INSTANCE;
    }

    // [method]------------------------------

    @SuppressWarnings("unchecked")
    public <I, O> Mapper<I, O> getMapper(String mappperId) {

        Mapper<I, O> mapper = null;

        switch (mappperId) {
            case PERSONA_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new ActividadPersonaDTOToEntityMapper();
                break;

            case PERSONA_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new ActividadPersonaEntityToDTOMapper();
                break;

            case TIPODOCUMENTAL_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new TipoDocumetalDTOToEntityMapper();
                break;

            case TIPODOCUMENTAL_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new TipoDocumentalEntityToDTOMapper();
                break;

            case TIPOIDENTIFICACION_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new TipoIdentificacionDTOToEntityMapper();
                break;

            case TIPOIDENTIFICACION_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new TipoIdentificacionEntityToDTOMapper();
                break;

            case TIPOTRAMITE_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new TipoTramiteDTOToEntityMapper();
                break;

            case TIPOTRAMITE_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new TipoTramiteEntityToDTOMapper();
                break;

            case ESTADOCIVIL_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new EstadoCivilDTOToEntityMapper();
                break;

            case ESTADOCICIL_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new EstadoCivilEntityToDTOMapper();
                break;

            case GENERO_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new GeneroDTOToEntityMapper();
                break;

            case GENERO_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new GeneroEntityToDTOMapper();
                break;

            case NACIONALIDAD_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new NacionalidadEntityToDTOMapper();
                break;

            case NIVELESTUDIO_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new NivelEstudioEntityToDTOMapper();
                break;

            case PROFESION_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new ProfesionEntityToDTOMapper();
                break;

            case GRUPOETNICO_DTO_TO_ENTITY:
                mapper = (Mapper<I,O>) new GrupoEtnicoEntityToDTOMapper();
                break;

            case DESTINOECONOMICO_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new DestinoEconomicoEntityToDTOMapper();
                break;

            case DESTINOFINANCIERO_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new DestinoFinancieroEntityToDTOMapper();
                break;

            case OTROPRODUCTO_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new OtroProductoEntityToDTOMapper();
                break;

            case OFICINA_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new OficinaEntityToDTOMapper();
                break;

            case PROVINCIA_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new ProvinciaEntityToDTOMapper();
                break;

            case PERIODICIDAD_ENTITY_TO_DTO:
                mapper = (Mapper<I,O>) new PeriodicidadEntityToDTOMapper();
                break;

            default:
                break;
        }

        return mapper;
    }

}
