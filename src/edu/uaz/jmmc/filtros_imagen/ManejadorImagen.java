/*
 * Copyright (C) 2016 juanmartinez
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.uaz.jmmc.filtros_imagen;

import java.net.URI;

/**
 *
 * @author juanmartinez
 */
public interface ManejadorImagen {
    
    public void guardarArregloEnImagen(String archivo, byte[][] arreglo);
    public byte[][] cargarArregloDeImagen(URI archivo);
    public byte[] flattenArray(byte[][] arreglo);
}
