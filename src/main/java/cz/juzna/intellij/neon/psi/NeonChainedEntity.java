package cz.juzna.intellij.neon.psi;

import java.util.List;

public interface NeonChainedEntity extends NeonValue {

	public List<NeonEntity> getValues();

}
