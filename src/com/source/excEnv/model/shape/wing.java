package com.source.excEnv.model.shape;

public class wing extends rotatableParallelogram {

	public float semiSpan, sweep, chord, dihedral, aoa;
	
	public wing(int x, int y, int aoa, int semiSpan, int dihedral, int sweep, int chord) {
		super(x, y, semiSpan, chord);
		this.semiSpan = semiSpan;
		this.aoa = aoa;
		this.dihedral = dihedral;
		this.sweep = sweep;
		this.chord = chord;
	}
	
	public void updateSemiSpan(float f) {
		this.semiSpan = f;
		super.updateLength(f);
	}public void updateChord(float f) {
		this.chord = f;
		super.updateWidth(f);
	}public void updateSweep(float f) {
		this.sweep = f;
		super.updateRot(f);
	}
}