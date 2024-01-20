fun isEmpty(n: Int, nums: IntArray, direction: Int): Boolean{
	if(direction==1) {
		for (i in 0 until nums.size) {
			if (nums[i] >= 0 && nums[i] <= n) return false
		}
	}else{
		for(i in nums.size-1 downTo 0){
			if (nums[i] >= 0 && nums[i] <= n) return false
		}
	}
	return true
}
fun getLastMoment(n: Int, left: IntArray, right: IntArray): Int {
	var lastMoment=0
	while(!isEmpty(n,left,0)||!isEmpty(n,right,1)){
		lastMoment++
		for(i in 0 until left.size){
			left[i]--
		}
		for(i in 0 until right.size){
			right[i]++
		}
	}
	return --lastMoment
}
fun main() {
	val left= intArrayOf(0,1,2,3,4,5,6,7)
	val right= intArrayOf()
	var lm=getLastMoment(7, left, right)
	println(lm)
	val left1= intArrayOf(0,1,2,3,4,5,6,7)
	val right1= intArrayOf()
	lm=getLastMoment(7, left1, right1)
	println(lm)
	val left2= intArrayOf(4,3)
	val right2= intArrayOf(0,1)
	lm=getLastMoment(4, left2, right2)
	println(lm)
}