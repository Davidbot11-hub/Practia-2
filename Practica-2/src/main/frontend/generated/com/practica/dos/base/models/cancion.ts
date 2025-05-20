import type TipoArchivoEnum_1 from "./TipoArchivoEnum.js";
interface cancion {
    id?: number;
    nombre?: string;
    id_genero?: number;
    duracion?: number;
    url?: string;
    tipo?: TipoArchivoEnum_1;
    idAlbum?: number;
}
export default cancion;
