package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fnrazclivw01 generated by hbm2java
 */
@Entity
@Table(name = "FNRAZCLIVW01")
public class Fnrazclivw01 implements java.io.Serializable {

	private Fnrazclivw01Id id;

	public Fnrazclivw01() {
	}

	public Fnrazclivw01(Fnrazclivw01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codempcl", column = @Column(name = "CODEMPCL")),
			@AttributeOverride(name = "codfilialcl", column = @Column(name = "CODFILIALCL")),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI")),
			@AttributeOverride(name = "razcli", column = @Column(name = "RAZCLI", length = 60)),
			@AttributeOverride(name = "codemprc", column = @Column(name = "CODEMPRC")),
			@AttributeOverride(name = "codfilialrc", column = @Column(name = "CODFILIALRC")),
			@AttributeOverride(name = "codempsl", column = @Column(name = "CODEMPSL")),
			@AttributeOverride(name = "codfilialsl", column = @Column(name = "CODFILIALSL")),
			@AttributeOverride(name = "codempcp", column = @Column(name = "CODEMPCP")),
			@AttributeOverride(name = "codfilialcp", column = @Column(name = "CODFILIALCP")),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", length = 10)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", length = 1)),
			@AttributeOverride(name = "tiposublanca", column = @Column(name = "TIPOSUBLANCA", length = 1)),
			@AttributeOverride(name = "doc", column = @Column(name = "DOC")),
			@AttributeOverride(name = "vlrdeb", column = @Column(name = "VLRDEB", precision = 0, scale = 5)),
			@AttributeOverride(name = "vlrcred", column = @Column(name = "VLRCRED", precision = 0, scale = 5)) })
	public Fnrazclivw01Id getId() {
		return this.id;
	}

	public void setId(Fnrazclivw01Id id) {
		this.id = id;
	}

}