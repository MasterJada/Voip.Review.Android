package chat.rocket.android.core.behaviours

interface DialogView {
    fun showDialog(callback: ()-> Unit)
    fun removeDialog()
}