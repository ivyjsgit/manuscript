package edu.hendrix.ivyjs.manuscript
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
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

    fun getSymbolDrawable(context: Context): Drawable? {
        return when (this.symbolType){

                TWELVEEIGHTTIME-> ResourcesCompat.getDrawable(context.resources, R.drawable.twelve_eight_time, null)
                TWOTWOTIME-> ResourcesCompat.getDrawable(context.resources, R.drawable.two_two_time, null)
                TWOFOURTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.two_four_time, null)
                THREEFOUR->ResourcesCompat.getDrawable(context.resources, R.drawable.three_four_time, null)
                THREEEIGHTTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.three_eight_time, null)
                FOURFOURTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.four_four_time, null)
                SIXEIGHTTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.six_eight_time, null)
                NINEEIGHTTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.nine_eight_time, null)
                BARLINE->ResourcesCompat.getDrawable(context.resources, R.drawable.barline, null)
                CCLEF->ResourcesCompat.getDrawable(context.resources, R.drawable.c_clef, null)
                COMMONTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.common_time, null)
                CUTTIME->ResourcesCompat.getDrawable(context.resources, R.drawable.cut_time, null)
                DOT->ResourcesCompat.getDrawable(context.resources, R.drawable.dot, null)
                DOUBLESHARP->ResourcesCompat.getDrawable(context.resources, R.drawable.double_sharp, null)
                EIGHTHNOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.eighth_note, null)
                EIGHTHREST->ResourcesCompat.getDrawable(context.resources, R.drawable.eighth_rest, null)
                FCLEF-> ResourcesCompat.getDrawable(context.resources, R.drawable.f_clef, null)
                FLAT->ResourcesCompat.getDrawable(context.resources, R.drawable.flat, null)
                GCLEF->ResourcesCompat.getDrawable(context.resources, R.drawable.g_clef, null)
                HALFNOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.half_note, null)
                NATURAL->ResourcesCompat.getDrawable(context.resources, R.drawable.natural, null)
                QUARTERNOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.quarter_note, null)
                QUARTERREST->ResourcesCompat.getDrawable(context.resources, R.drawable.quarter_rest, null)
                SHARP->ResourcesCompat.getDrawable(context.resources, R.drawable.sharp, null)
                SIXTEENTHNOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.sixteenth_note, null)
                SIXTEENTHREST->ResourcesCompat.getDrawable(context.resources, R.drawable.sixteenth_rest, null)
                SIXTYFOURNOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.sixty_four_note, null)
                SIXTYFOURREST->ResourcesCompat.getDrawable(context.resources, R.drawable.sixty_four_rest, null)
                THIRTYTWONOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.thirty_two_note, null)
                THIRTYTWOREST->ResourcesCompat.getDrawable(context.resources, R.drawable.thirty_two_rest, null)
                WHOLEHALFREST->ResourcesCompat.getDrawable(context.resources, R.drawable.whole_half_rest, null)
                WHOLENOTE->ResourcesCompat.getDrawable(context.resources, R.drawable.whole_note, null)
                UNKNOWN->null

            else -> null
        }
    }
}