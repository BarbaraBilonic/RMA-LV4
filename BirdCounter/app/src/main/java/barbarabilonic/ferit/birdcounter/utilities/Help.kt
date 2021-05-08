package barbarabilonic.ferit.birdcounter.utilities



import barbarabilonic.ferit.birdcounter.R

fun getBorder(color:Int): Int{
    return  when(color) {
        1 ->R.drawable.border_brown
        2-> R.drawable.border_grey
        3-> R.drawable.border_black
        4-> R.drawable.border_yellow
        else-> R.drawable.border_white
    }
}