package my.kmp.app

data class CounterState(val count: Int = 0)
fun defaultCounterState() = CounterState()

class CounterLogic {
    fun inc(state: CounterState) = state.copy(count = state.count +1 )
    fun dec(state: CounterState): CounterState {
        return if(state.count > 0) {
            state.copy(count = state.count-1)
        }else {
            state
        }
    }
}