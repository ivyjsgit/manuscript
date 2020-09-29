package edu.hendrix.ivyjs.manuscript
import edu.hendrix.ivyjs.manuscript.SymbolEnum.*;
import edu.hendrix.ivyjs.manuscript.SymbolPosition.*;

class Symbol(symbolType: String, symbolPositionOnStaff: String) {
    var symbolType = UNKNOWN;
    var symbolPositionOnStaff = E;

    init{
        this.symbolType= stringToEnum(symbolType);
        this.symbolPositionOnStaff=SymbolPosition.valueOf(symbolPositionOnStaff);
    }

    //Why can't I just override the valueOf methods for enums????
    private fun stringToEnum(value: String): SymbolEnum {
        return when (value) {
            "12-8-Time" -> TWELVEEIGHTTIME
            "2-2-Time" -> TWOTWOTIME
            "2-4-Time" -> TWOFOURTIME
            "3-4-Time" -> THREEFOUR
            "3-8-Time" -> THREEEIGHTTIME
            "4-4-Time" -> FOURFOURTIME
            "6-8-Time" -> SIXEIGHTTIME
            "9-8-Time" -> NINEEIGHTTIME
            "Barline" -> BARLINE
            "C-Clef" -> CCLEF
            "Common-Time" -> COMMONTIME
            "Cut-Time" -> CUTTIME
            "Dot" -> DOT
            "Double-Sharp" -> DOUBLESHARP
            "Eighth-Note" -> EIGHTHNOTE
            "Eighth-Rest" -> EIGHTHREST
            "F-Clef" -> FCLEF
            "Flat" -> FLAT
            "G-Clef" -> GCLEF
            "Half-Note" -> HALFNOTE
            "Natural" -> NATURAL
            "Quarter-Note" -> QUARTERNOTE
            "Quarter-Rest" -> QUARTERREST
            "Sharp" -> SHARP
            "Sixteenth-Note" -> SIXTEENTHNOTE
            "Sixteenth-Rest" -> SIXTEENTHREST
            "Sixty-Four-Note" -> SIXTYFOURNOTE
            "Sixty-Four-Rest" -> SIXTYFOURREST
            "Thirty-Two-Note" -> THIRTYTWONOTE
            "Thirty-Two-Rest" -> THIRTYTWOREST
            "Whole-Half-Rest" -> WHOLEHALFREST
            "Whole-Note" -> WHOLENOTE

            else -> UNKNOWN

        }
    }
}