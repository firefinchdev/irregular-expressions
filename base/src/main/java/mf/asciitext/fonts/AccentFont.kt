package mf.asciitext.fonts

class AccentFont internal constructor(
    id: String,
    name: String,
    private val uChar: String,
    premium: Boolean
) : AppFont(id, name, premium) {

    override fun encode(text: String?): String? {
        if (!isEmpty(text)) {
            val cs = text!!.toCharArray()
            val temp = StringBuilder()
            for (c in cs) {
                if (!Character.isWhitespace(c))
                    temp.append(uChar)
                temp.append(c)
            }
            temp.append(uChar)
            return temp.toString()
        }
        return text;
    }
}
