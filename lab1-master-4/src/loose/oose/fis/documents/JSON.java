package loose.oose.fis.documents;

import java.util.Arrays;

public class JSON extends Document {
    public JSON(String[] continut) {
        super(continut);
    }

    @Override
    public String[] analizeaza() {
        String[] res = new String[continut.length];
        int      pos = 0;

        for (String cuvant : continut) {
            if (!cuvant.contains(":")) {
                res[pos] = cuvant;
                pos++;
            }
        }

        return Arrays.copyOf(res, pos);
    }

    @Override
    public String toString() {
        return "JSON " + super.toString();
    }
}
