/**
 * BidLua - compiled language for Lua.
 * Copyright (C) 2023 defaultzon3 (also known as DZONE)
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
 * along with this program.  If not, see < https://www.gnu.org/licenses/ >.
 */

import java.io.File

/**
 * In progress, now it's for debugging.
 * TODO: Program arguments (as input-file and ouput-file, maybe descriptor-file.
 * @param args Program arguments which represents as Array<String>.
 */

fun main(args : Array<String>) {
    val fileToRead : File = File(args[0])
    compile(fileToRead.readText())
}