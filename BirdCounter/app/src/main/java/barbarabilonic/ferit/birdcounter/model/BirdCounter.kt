package barbarabilonic.ferit.birdcounter.model



class BirdCounter {
    var birdCount=0
        private set
   var color= 0
        private set



     fun seeBird()=birdCount++

    fun setColor(c:Int){
        color= c
    }
    fun reset() {
        birdCount = 0
        color = 0
    }

    fun setBirdCount(count:Int){
        birdCount=count
    }






}