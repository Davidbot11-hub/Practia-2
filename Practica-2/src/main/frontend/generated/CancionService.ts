import { EndpointRequestInit as EndpointRequestInit_1 } from "@vaadin/hilla-frontend";
import type cancion_1 from "./com/practica/dos/base/models/cancion.js";
import client_1 from "./connect-client.default.js";
async function create_1(nombre: string | undefined, id_genero: number | undefined, duracion: number | undefined, url: string | undefined, tipo: string | undefined, id_albun: number | undefined, init?: EndpointRequestInit_1): Promise<void> { return client_1.call("CancionService", "create", { nombre, id_genero, duracion, url, tipo, id_albun }, init); }
async function listAllCancion_1(init?: EndpointRequestInit_1): Promise<Array<cancion_1 | undefined> | undefined> { return client_1.call("CancionService", "listAllCancion", {}, init); }
async function listCancion_1(init?: EndpointRequestInit_1): Promise<Array<Record<string, unknown> | undefined> | undefined> { return client_1.call("CancionService", "listCancion", {}, init); }
async function listTipo_1(init?: EndpointRequestInit_1): Promise<Array<string | undefined> | undefined> { return client_1.call("CancionService", "listTipo", {}, init); }
async function listaAlbumCombo_1(init?: EndpointRequestInit_1): Promise<Array<Record<string, unknown> | undefined> | undefined> { return client_1.call("CancionService", "listaAlbumCombo", {}, init); }
async function listaAlbumGenero_1(init?: EndpointRequestInit_1): Promise<Array<Record<string, unknown> | undefined> | undefined> { return client_1.call("CancionService", "listaAlbumGenero", {}, init); }
async function update_1(id: number | undefined, nombre: string | undefined, id_genero: number | undefined, duracion: number | undefined, url: string | undefined, tipo: string | undefined, id_albun: number | undefined, init?: EndpointRequestInit_1): Promise<void> { return client_1.call("CancionService", "update", { id, nombre, id_genero, duracion, url, tipo, id_albun }, init); }
export { create_1 as create, listaAlbumCombo_1 as listaAlbumCombo, listaAlbumGenero_1 as listaAlbumGenero, listAllCancion_1 as listAllCancion, listCancion_1 as listCancion, listTipo_1 as listTipo, update_1 as update };
