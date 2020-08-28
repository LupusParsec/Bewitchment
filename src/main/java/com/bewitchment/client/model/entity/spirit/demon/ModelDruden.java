package com.bewitchment.client.model.entity.spirit.demon;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * drude - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDruden extends ModelBiped {
	public ModelRenderer bipedBody;
	public ModelRenderer boobs;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer lowerBody;
	public ModelRenderer hair00;
	public ModelRenderer hair01;
	public ModelRenderer leftAntler00;
	public ModelRenderer rightAntler00;
	public ModelRenderer hood;
	public ModelRenderer leftAntler01a;
	public ModelRenderer leftAntler07a;
	public ModelRenderer leftAntler01b;
	public ModelRenderer leftAntler01c;
	public ModelRenderer leftAntler01d;
	public ModelRenderer leftAntler02;
	public ModelRenderer leftAntler06a;
	public ModelRenderer leftAntler03a;
	public ModelRenderer leftAntler04a;
	public ModelRenderer leftAntler05a;
	public ModelRenderer leftAntler03b;
	public ModelRenderer leftAntler03c;
	public ModelRenderer leftAntler04b;
	public ModelRenderer leftAntler05b;
	public ModelRenderer leftAntler06b;
	public ModelRenderer leftAntler07b;
	public ModelRenderer rightAntler01a;
	public ModelRenderer rightAntler07a;
	public ModelRenderer rightAntler01b;
	public ModelRenderer rightAntler01c;
	public ModelRenderer rightAntler01d;
	public ModelRenderer rightAntler02;
	public ModelRenderer rightAntler06a;
	public ModelRenderer rightAntler03a;
	public ModelRenderer rightAntler04a;
	public ModelRenderer rightAntler05a;
	public ModelRenderer rightAntler03b;
	public ModelRenderer rightAntler03c;
	public ModelRenderer rightAntler04b;
	public ModelRenderer rightAntler05b;
	public ModelRenderer rightAntler06b;
	public ModelRenderer rightAntler07b;
	public ModelRenderer leftArmLeaves00;
	public ModelRenderer leftClaw00;
	public ModelRenderer leftClaw01;
	public ModelRenderer leftClaw02;
	public ModelRenderer leftArmLeaves01;
	public ModelRenderer rightArmLeaves00;
	public ModelRenderer rightClaw00;
	public ModelRenderer rightClaw01;
	public ModelRenderer rightClaw02;
	public ModelRenderer rightArmLeaves01;
	public ModelRenderer backSkirt00;
	public ModelRenderer leftSkirt;
	public ModelRenderer rightSkirt;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer backSkirt01;
	public ModelRenderer leftLeg01;
	public ModelRenderer leftLeg02;
	public ModelRenderer leftHoof;
	public ModelRenderer rightLeg01;
	public ModelRenderer rightLeg02;
	public ModelRenderer rightHoof;

	public ModelDruden() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.bipedBody = new ModelRenderer(this, 19, 17);
		this.bipedBody.setRotationPoint(0.0F, -8.8F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
		this.leftAntler02 = new ModelRenderer(this, 49, 34);
		this.leftAntler02.setRotationPoint(0.0F, -3.1F, 0.0F);
		this.leftAntler02.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(leftAntler02, 0.0F, 0.0F, -0.3141592653589793F);
		this.rightAntler01b = new ModelRenderer(this, 49, 34);
		this.rightAntler01b.mirror = true;
		this.rightAntler01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightAntler01b.addBox(-0.8F, -3.5F, -0.8F, 1, 4, 1, 0.0F);
		this.rightAntler05b = new ModelRenderer(this, 49, 34);
		this.rightAntler05b.mirror = true;
		this.rightAntler05b.setRotationPoint(-0.0F, -2.7F, 0.0F);
		this.rightAntler05b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightAntler05b, 0.3141592653589793F, 0.0F, -0.3141592653589793F);
		this.leftAntler00 = new ModelRenderer(this, 49, 34);
		this.leftAntler00.setRotationPoint(1.9F, -7.1F, 0.0F);
		this.leftAntler00.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(leftAntler00, -0.20943951023931953F, 0.0F, 0.3490658503988659F);
		this.rightClaw00 = new ModelRenderer(this, 0, 0);
		this.rightClaw00.mirror = true;
		this.rightClaw00.setRotationPoint(-0.6F, 11.2F, -1.5F);
		this.rightClaw00.addBox(-1.8F, -1.5F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(rightClaw00, -0.10471975511965977F, 0.0F, -0.22689280275926282F);
		this.boobs = new ModelRenderer(this, 0, 57);
		this.boobs.setRotationPoint(0.0F, 1.3F, -0.3F);
		this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
		this.setRotateAngle(boobs, -0.4886921905584123F, 0.0F, 0.0F);
		this.leftAntler04a = new ModelRenderer(this, 49, 34);
		this.leftAntler04a.setRotationPoint(-0.9F, -5.9F, 0.0F);
		this.leftAntler04a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftAntler04a, 0.45378560551852565F, 0.0F, -0.8028514559173915F);
		this.rightAntler01a = new ModelRenderer(this, 49, 34);
		this.rightAntler01a.mirror = true;
		this.rightAntler01a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.rightAntler01a.addBox(-0.2F, -3.5F, -0.8F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rightAntler01a, -0.20943951023931953F, 0.0F, -0.6108652381980153F);
		this.leftAntler06a = new ModelRenderer(this, 49, 34);
		this.leftAntler06a.setRotationPoint(0.0F, -2.5F, -0.4F);
		this.leftAntler06a.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
		this.setRotateAngle(leftAntler06a, -0.6283185307179586F, 0.6981317007977318F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 1);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.rightAntler02 = new ModelRenderer(this, 49, 34);
		this.rightAntler02.mirror = true;
		this.rightAntler02.setRotationPoint(0.0F, -3.1F, 0.0F);
		this.rightAntler02.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rightAntler02, 0.0F, 0.0F, 0.3141592653589793F);
		this.leftAntler01b = new ModelRenderer(this, 49, 34);
		this.leftAntler01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftAntler01b.addBox(-0.8F, -3.5F, -0.8F, 1, 4, 1, 0.0F);
		this.rightClaw01 = new ModelRenderer(this, 0, 0);
		this.rightClaw01.mirror = true;
		this.rightClaw01.setRotationPoint(-0.6F, 11.2F, 0.0F);
		this.rightClaw01.addBox(-1.8F, -1.2F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(rightClaw01, 0.0F, 0.0F, -0.22689280275926282F);
		this.rightSkirt = new ModelRenderer(this, 88, 22);
		this.rightSkirt.mirror = true;
		this.rightSkirt.setRotationPoint(-2.2F, 5.8F, 0.0F);
		this.rightSkirt.addBox(-1.9F, 0.0F, -2.5F, 2, 14, 5, 0.0F);
		this.setRotateAngle(rightSkirt, -0.06981317007977318F, 0.0F, 0.08726646259971647F);
		this.rightArmLeaves00 = new ModelRenderer(this, 33, 39);
		this.rightArmLeaves00.mirror = true;
		this.rightArmLeaves00.setRotationPoint(-0.5F, 5.3F, 0.0F);
		this.rightArmLeaves00.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
		this.leftLeg02 = new ModelRenderer(this, 0, 41);
		this.leftLeg02.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.leftLeg02.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(leftLeg02, -0.41887902047863906F, 0.0F, 0.0F);
		this.leftAntler01d = new ModelRenderer(this, 49, 34);
		this.leftAntler01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftAntler01d.addBox(-0.8F, -3.5F, -0.2F, 1, 4, 1, 0.0F);
		this.leftAntler05b = new ModelRenderer(this, 49, 34);
		this.leftAntler05b.setRotationPoint(-0.0F, -2.7F, 0.0F);
		this.leftAntler05b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftAntler05b, 0.3141592653589793F, 0.0F, 0.3141592653589793F);
		this.rightAntler01c = new ModelRenderer(this, 49, 34);
		this.rightAntler01c.mirror = true;
		this.rightAntler01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightAntler01c.addBox(-0.2F, -3.5F, -0.2F, 1, 4, 1, 0.0F);
		this.rightAntler03a = new ModelRenderer(this, 49, 34);
		this.rightAntler03a.mirror = true;
		this.rightAntler03a.setRotationPoint(0.0F, -3.7F, 0.0F);
		this.rightAntler03a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightAntler03a, 0.0F, 0.0F, 0.3490658503988659F);
		this.hood = new ModelRenderer(this, 69, 0);
		this.hood.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hood.addBox(-4.5F, -8.5F, -4.5F, 9, 11, 9, 0.0F);
		this.rightAntler06a = new ModelRenderer(this, 49, 34);
		this.rightAntler06a.mirror = true;
		this.rightAntler06a.setRotationPoint(0.0F, -2.5F, -0.4F);
		this.rightAntler06a.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rightAntler06a, -0.6283185307179586F, -0.6981317007977318F, 0.0F);
		this.leftAntler03c = new ModelRenderer(this, 49, 34);
		this.leftAntler03c.setRotationPoint(-0.0F, -3.7F, 0.0F);
		this.leftAntler03c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftAntler03c, 0.0F, 0.0F, -0.4363323129985824F);
		this.leftAntler04b = new ModelRenderer(this, 49, 34);
		this.leftAntler04b.setRotationPoint(-0.0F, -2.7F, 0.0F);
		this.leftAntler04b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftAntler04b, -0.3141592653589793F, 0.0F, 0.0F);
		this.leftSkirt = new ModelRenderer(this, 88, 22);
		this.leftSkirt.setRotationPoint(2.2F, 5.8F, 0.0F);
		this.leftSkirt.addBox(0.0F, 0.0F, -2.5F, 2, 14, 5, 0.0F);
		this.setRotateAngle(leftSkirt, -0.06981317007977318F, 0.0F, -0.08726646259971647F);
		this.leftAntler07b = new ModelRenderer(this, 49, 34);
		this.leftAntler07b.setRotationPoint(0.1F, 0.0F, -3.4F);
		this.leftAntler07b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(leftAntler07b, 0.0F, 0.5759586531581287F, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 17);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.1F, 8.0F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.2617993877991494F, 0.0F, 0.10471975511965977F);
		this.rightAntler04b = new ModelRenderer(this, 49, 34);
		this.rightAntler04b.mirror = true;
		this.rightAntler04b.setRotationPoint(-0.0F, -2.7F, 0.0F);
		this.rightAntler04b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightAntler04b, -0.3141592653589793F, 0.0F, 0.0F);
		this.leftLeg01 = new ModelRenderer(this, 0, 30);
		this.leftLeg01.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.leftLeg01.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(leftLeg01, 0.6981317007977318F, 0.0F, 0.10471975511965977F);
		this.rightLeg01 = new ModelRenderer(this, 0, 30);
		this.rightLeg01.mirror = true;
		this.rightLeg01.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.rightLeg01.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rightLeg01, 0.6981317007977318F, 0.0F, -0.10471975511965977F);
		this.lowerBody = new ModelRenderer(this, 19, 27);
		this.lowerBody.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.lowerBody.addBox(-3.5F, 0.0F, -2.0F, 7, 8, 4, 0.0F);
		this.leftAntler07a = new ModelRenderer(this, 49, 34);
		this.leftAntler07a.setRotationPoint(0.0F, -2.0F, -0.4F);
		this.leftAntler07a.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
		this.setRotateAngle(leftAntler07a, -0.9075712110370513F, 0.5235987755982988F, 0.0F);
		this.rightAntler05a = new ModelRenderer(this, 49, 34);
		this.rightAntler05a.mirror = true;
		this.rightAntler05a.setRotationPoint(1.2F, -6.7F, 0.0F);
		this.rightAntler05a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightAntler05a, -0.5235987755982988F, 0.0F, 1.3089969389957472F);
		this.leftAntler01c = new ModelRenderer(this, 49, 34);
		this.leftAntler01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftAntler01c.addBox(-0.2F, -3.5F, -0.2F, 1, 4, 1, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 44, 14);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 14, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
		this.rightAntler00 = new ModelRenderer(this, 49, 34);
		this.rightAntler00.mirror = true;
		this.rightAntler00.setRotationPoint(-1.9F, -7.1F, 0.0F);
		this.rightAntler00.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rightAntler00, -0.20943951023931953F, 0.0F, -0.3490658503988659F);
		this.rightHoof = new ModelRenderer(this, 0, 51);
		this.rightHoof.mirror = true;
		this.rightHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.rightHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 2, 4, 0.0F);
		this.leftHoof = new ModelRenderer(this, 0, 51);
		this.leftHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.leftHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 2, 4, 0.0F);
		this.rightClaw02 = new ModelRenderer(this, 0, 0);
		this.rightClaw02.mirror = true;
		this.rightClaw02.setRotationPoint(-0.6F, 11.2F, 1.5F);
		this.rightClaw02.addBox(-1.8F, -1.5F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(rightClaw02, 0.10471975511965977F, 0.0F, -0.22689280275926282F);
		this.rightAntler03c = new ModelRenderer(this, 49, 34);
		this.rightAntler03c.mirror = true;
		this.rightAntler03c.setRotationPoint(-0.0F, -3.7F, 0.0F);
		this.rightAntler03c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightAntler03c, 0.0F, 0.0F, 0.4363323129985824F);
		this.leftClaw01 = new ModelRenderer(this, 0, 0);
		this.leftClaw01.setRotationPoint(0.6F, 11.2F, 0.0F);
		this.leftClaw01.addBox(-0.2F, -1.2F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(leftClaw01, 0.0F, 0.0F, 0.22689280275926282F);
		this.leftAntler03b = new ModelRenderer(this, 49, 34);
		this.leftAntler03b.setRotationPoint(-0.0F, -2.8F, 0.0F);
		this.leftAntler03b.addBox(-0.5F, -3.9F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(leftAntler03b, -0.10471975511965977F, 0.0F, -0.2792526803190927F);
		this.rightAntler06b = new ModelRenderer(this, 49, 34);
		this.rightAntler06b.mirror = true;
		this.rightAntler06b.setRotationPoint(-0.1F, 0.0F, -3.4F);
		this.rightAntler06b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rightAntler06b, 0.0F, -0.5759586531581287F, 0.0F);
		this.rightAntler07a = new ModelRenderer(this, 49, 34);
		this.rightAntler07a.mirror = true;
		this.rightAntler07a.setRotationPoint(0.0F, -2.0F, -0.4F);
		this.rightAntler07a.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rightAntler07a, -0.9075712110370513F, -0.5235987755982988F, 0.0F);
		this.leftClaw00 = new ModelRenderer(this, 0, 0);
		this.leftClaw00.setRotationPoint(0.6F, 11.2F, -1.5F);
		this.leftClaw00.addBox(-0.2F, -1.5F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(leftClaw00, -0.10471975511965977F, 0.0F, 0.22689280275926282F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 17);
		this.bipedLeftLeg.setRotationPoint(2.1F, 8.0F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.2617993877991494F, 0.0F, -0.10471975511965977F);
		this.rightAntler03b = new ModelRenderer(this, 49, 34);
		this.rightAntler03b.mirror = true;
		this.rightAntler03b.setRotationPoint(-0.0F, -2.8F, 0.0F);
		this.rightAntler03b.addBox(-0.5F, -3.9F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rightAntler03b, -0.10471975511965977F, 0.0F, 0.2792526803190927F);
		this.rightLeg02 = new ModelRenderer(this, 0, 41);
		this.rightLeg02.mirror = true;
		this.rightLeg02.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.rightLeg02.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(rightLeg02, -0.41887902047863906F, 0.0F, 0.0F);
		this.rightAntler01d = new ModelRenderer(this, 49, 34);
		this.rightAntler01d.mirror = true;
		this.rightAntler01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightAntler01d.addBox(-0.8F, -3.5F, -0.2F, 1, 4, 1, 0.0F);
		this.hair01 = new ModelRenderer(this, 25, 0);
		this.hair01.mirror = true;
		this.hair01.setRotationPoint(0.0F, -6.9F, 3.2F);
		this.hair01.addBox(-4.0F, 0.0F, -0.1F, 8, 8, 1, 0.0F);
		this.setRotateAngle(hair01, 0.8726646259971648F, 0.0F, 0.0F);
		this.hair00 = new ModelRenderer(this, 44, 0);
		this.hair00.setRotationPoint(0.0F, -5.1F, 3.2F);
		this.hair00.addBox(-4.0F, 0.0F, -1.0F, 8, 11, 2, 0.0F);
		this.setRotateAngle(hair00, 0.6981317007977318F, 0.0F, 0.0F);
		this.leftArmLeaves00 = new ModelRenderer(this, 33, 39);
		this.leftArmLeaves00.setRotationPoint(0.5F, 5.3F, 0.0F);
		this.leftArmLeaves00.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
		this.leftClaw02 = new ModelRenderer(this, 0, 0);
		this.leftClaw02.setRotationPoint(0.6F, 11.2F, 1.5F);
		this.leftClaw02.addBox(-0.2F, -1.5F, -0.5F, 2, 5, 1, 0.0F);
		this.setRotateAngle(leftClaw02, 0.10471975511965977F, 0.0F, 0.22689280275926282F);
		this.backSkirt01 = new ModelRenderer(this, 62, 22);
		this.backSkirt01.setRotationPoint(0.0F, 3.1F, 0.2F);
		this.backSkirt01.addBox(-4.5F, 0.0F, 0.0F, 9, 11, 2, 0.0F);
		this.setRotateAngle(backSkirt01, -0.41887902047863906F, 0.0F, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 44, 14);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 14, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
		this.rightArmLeaves01 = new ModelRenderer(this, 13, 39);
		this.rightArmLeaves01.mirror = true;
		this.rightArmLeaves01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightArmLeaves01.addBox(-2.0F, -6.0F, -2.5F, 4, 6, 5, 0.0F);
		this.rightAntler07b = new ModelRenderer(this, 49, 34);
		this.rightAntler07b.mirror = true;
		this.rightAntler07b.setRotationPoint(-0.1F, 0.0F, -3.4F);
		this.rightAntler07b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rightAntler07b, 0.0F, -0.5759586531581287F, 0.0F);
		this.leftArmLeaves01 = new ModelRenderer(this, 13, 39);
		this.leftArmLeaves01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftArmLeaves01.addBox(-2.0F, -6.0F, -2.5F, 4, 6, 5, 0.0F);
		this.leftAntler03a = new ModelRenderer(this, 49, 34);
		this.leftAntler03a.setRotationPoint(0.0F, -3.7F, 0.0F);
		this.leftAntler03a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftAntler03a, 0.0F, 0.0F, -0.3490658503988659F);
		this.leftAntler05a = new ModelRenderer(this, 49, 34);
		this.leftAntler05a.setRotationPoint(-1.2F, -6.7F, 0.0F);
		this.leftAntler05a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftAntler05a, -0.5235987755982988F, 0.0F, -1.3089969389957472F);
		this.leftAntler01a = new ModelRenderer(this, 49, 34);
		this.leftAntler01a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.leftAntler01a.addBox(-0.2F, -3.5F, -0.8F, 1, 4, 1, 0.0F);
		this.setRotateAngle(leftAntler01a, -0.20943951023931953F, 0.0F, 0.6108652381980153F);
		this.rightAntler04a = new ModelRenderer(this, 49, 34);
		this.rightAntler04a.mirror = true;
		this.rightAntler04a.setRotationPoint(0.9F, -5.9F, 0.0F);
		this.rightAntler04a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightAntler04a, 0.45378560551852565F, 0.0F, 0.8028514559173915F);
		this.backSkirt00 = new ModelRenderer(this, 62, 22);
		this.backSkirt00.setRotationPoint(0.0F, 6.1F, 0.0F);
		this.backSkirt00.addBox(-4.5F, 0.0F, 0.0F, 9, 4, 2, 0.0F);
		this.setRotateAngle(backSkirt00, 0.41887902047863906F, 0.0F, 0.0F);
		this.leftAntler06b = new ModelRenderer(this, 49, 34);
		this.leftAntler06b.setRotationPoint(0.1F, 0.0F, -3.4F);
		this.leftAntler06b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(leftAntler06b, 0.0F, 0.5759586531581287F, 0.0F);
		this.leftAntler01a.addChild(this.leftAntler02);
		this.rightAntler01a.addChild(this.rightAntler01b);
		this.rightAntler05a.addChild(this.rightAntler05b);
		this.bipedHead.addChild(this.leftAntler00);
		this.bipedRightArm.addChild(this.rightClaw00);
		this.bipedBody.addChild(this.boobs);
		this.leftAntler02.addChild(this.leftAntler04a);
		this.rightAntler00.addChild(this.rightAntler01a);
		this.leftAntler01a.addChild(this.leftAntler06a);
		this.bipedBody.addChild(this.bipedHead);
		this.rightAntler01a.addChild(this.rightAntler02);
		this.leftAntler01a.addChild(this.leftAntler01b);
		this.bipedRightArm.addChild(this.rightClaw01);
		this.lowerBody.addChild(this.rightSkirt);
		this.bipedRightArm.addChild(this.rightArmLeaves00);
		this.leftLeg01.addChild(this.leftLeg02);
		this.leftAntler01a.addChild(this.leftAntler01d);
		this.leftAntler05a.addChild(this.leftAntler05b);
		this.rightAntler01a.addChild(this.rightAntler01c);
		this.rightAntler02.addChild(this.rightAntler03a);
		this.bipedHead.addChild(this.hood);
		this.rightAntler01a.addChild(this.rightAntler06a);
		this.leftAntler03b.addChild(this.leftAntler03c);
		this.leftAntler04a.addChild(this.leftAntler04b);
		this.lowerBody.addChild(this.leftSkirt);
		this.leftAntler07a.addChild(this.leftAntler07b);
		this.lowerBody.addChild(this.bipedRightLeg);
		this.rightAntler04a.addChild(this.rightAntler04b);
		this.bipedLeftLeg.addChild(this.leftLeg01);
		this.bipedRightLeg.addChild(this.rightLeg01);
		this.bipedBody.addChild(this.lowerBody);
		this.leftAntler00.addChild(this.leftAntler07a);
		this.rightAntler02.addChild(this.rightAntler05a);
		this.leftAntler01a.addChild(this.leftAntler01c);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.bipedHead.addChild(this.rightAntler00);
		this.rightLeg02.addChild(this.rightHoof);
		this.leftLeg02.addChild(this.leftHoof);
		this.bipedRightArm.addChild(this.rightClaw02);
		this.rightAntler03b.addChild(this.rightAntler03c);
		this.bipedLeftArm.addChild(this.leftClaw01);
		this.leftAntler03a.addChild(this.leftAntler03b);
		this.rightAntler06a.addChild(this.rightAntler06b);
		this.rightAntler00.addChild(this.rightAntler07a);
		this.bipedLeftArm.addChild(this.leftClaw00);
		this.lowerBody.addChild(this.bipedLeftLeg);
		this.rightAntler03a.addChild(this.rightAntler03b);
		this.rightLeg01.addChild(this.rightLeg02);
		this.rightAntler01a.addChild(this.rightAntler01d);
		this.bipedHead.addChild(this.hair01);
		this.bipedHead.addChild(this.hair00);
		this.bipedLeftArm.addChild(this.leftArmLeaves00);
		this.bipedLeftArm.addChild(this.leftClaw02);
		this.backSkirt00.addChild(this.backSkirt01);
		this.bipedBody.addChild(this.bipedRightArm);
		this.rightArmLeaves00.addChild(this.rightArmLeaves01);
		this.rightAntler07a.addChild(this.rightAntler07b);
		this.leftArmLeaves00.addChild(this.leftArmLeaves01);
		this.leftAntler02.addChild(this.leftAntler03a);
		this.leftAntler02.addChild(this.leftAntler05a);
		this.leftAntler00.addChild(this.leftAntler01a);
		this.rightAntler02.addChild(this.rightAntler04a);
		this.lowerBody.addChild(this.backSkirt00);
		this.leftAntler06a.addChild(this.leftAntler06b);
	}

	private static float triangleWave(float x, float y) {
		return (Math.abs(x % y - y * 0.5f) - y * 0.25f) / (y * 0.25f);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedBody.render(f5);
	}

	@SuppressWarnings("incomplete-switch")
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase) entityIn).getTicksElytraFlying() > 4;
		this.bipedHead.rotateAngleY = netHeadYaw * 0.017453292F;

		if (flag) {
			this.bipedHead.rotateAngleX = -((float) Math.PI / 4F);
		} else {
			this.bipedHead.rotateAngleX = headPitch * 0.017453292F;
		}

		this.bipedBody.rotateAngleY = 0.0F;
		this.bipedRightArm.rotationPointZ = 0.0F;
		this.bipedRightArm.rotationPointX = -5.0F;
		this.bipedLeftArm.rotationPointZ = 0.0F;
		this.bipedLeftArm.rotationPointX = 5.0F;
		float f = 1.0F;

		if (flag) {
			f = (float) (entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
			f = f / 0.2F;
			f = f * f * f;
		}

		if (f < 1.0F) {
			f = 1.0F;
		}

		this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		float swingMod = 0.3F;
		this.bipedRightLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingMod * limbSwingAmount - 0.26F;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingMod * limbSwingAmount - 0.26F;

		this.bipedRightArm.rotateAngleY = 0.0F;
		this.bipedRightArm.rotateAngleZ = 0.0F;

		switch (this.leftArmPose) {
			case EMPTY:
				this.bipedLeftArm.rotateAngleY = 0.0F;
				break;
			case BLOCK:
				this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.9424779F;
				this.bipedLeftArm.rotateAngleY = 0.5235988F;
				break;
			case ITEM:
				this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
				this.bipedLeftArm.rotateAngleY = 0.0F;
		}

		switch (this.rightArmPose) {
			case EMPTY:
				this.bipedRightArm.rotateAngleY = 0.0F;
				break;
			case BLOCK:
				this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.9424779F;
				this.bipedRightArm.rotateAngleY = -0.5235988F;
				break;
			case ITEM:
				this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
				this.bipedRightArm.rotateAngleY = 0.0F;
		}

		if (this.swingProgress > 0.0F) {
			EnumHandSide enumhandside = this.getMainHand(entityIn);
			ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
			float f1 = this.swingProgress;
			this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float) Math.PI * 2F)) * 0.2F;

			if (enumhandside == EnumHandSide.LEFT) {
				this.bipedBody.rotateAngleY *= -1.0F;
			}

			this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
			f1 = 1.0F - this.swingProgress;
			f1 = f1 * f1;
			f1 = f1 * f1;
			f1 = 1.0F - f1;
			float f2 = MathHelper.sin(f1 * (float) Math.PI);
			float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
			modelrenderer.rotateAngleX = (float) ((double) modelrenderer.rotateAngleX - ((double) f2 * 1.2D + (double) f3));
			modelrenderer.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
			modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
		}

		this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

		if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
			this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
			this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
			this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
		} else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
			this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
			this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
			this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
		}

		copyModelAngles(this.bipedHead, this.bipedHeadwear);
	}

	@Override
	public void postRenderArm(float scale, EnumHandSide side) {
		GlStateManager.translate(-0.025F, -0.35, 0);
		super.postRenderArm(scale, side);
	}

	protected ModelRenderer getArmForSide(EnumHandSide side) {
		return side == EnumHandSide.LEFT ? this.bipedLeftArm : this.bipedRightArm;
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
