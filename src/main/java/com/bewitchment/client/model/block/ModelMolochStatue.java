package com.bewitchment.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * statueMoloch - cybecat5555
 * Created using Tabula 7.0.1
 */
public class ModelMolochStatue extends ModelBase {
	public ModelRenderer plith01;
	public ModelRenderer chest;
	public ModelRenderer plith02;
	public ModelRenderer neck;
	public ModelRenderer leftPec;
	public ModelRenderer rightPec;
	public ModelRenderer torso;
	public ModelRenderer leftArm00;
	public ModelRenderer rightArm00;
	public ModelRenderer mantle00;
	public ModelRenderer head;
	public ModelRenderer rEar00;
	public ModelRenderer lowerJaw;
	public ModelRenderer snout;
	public ModelRenderer lEar00;
	public ModelRenderer upperJaw;
	public ModelRenderer lHorn00;
	public ModelRenderer rHorn00;
	public ModelRenderer rEar01;
	public ModelRenderer lEar01;
	public ModelRenderer lHorn01;
	public ModelRenderer lHorn02a;
	public ModelRenderer lHorn02b;
	public ModelRenderer lHorn02c;
	public ModelRenderer lHorn02d;
	public ModelRenderer lHorn03;
	public ModelRenderer rHorn01;
	public ModelRenderer rHorn02a;
	public ModelRenderer rHorn02b;
	public ModelRenderer rHorn02c;
	public ModelRenderer rHorn02d;
	public ModelRenderer rHorn03;
	public ModelRenderer belly;
	public ModelRenderer loinclothFront;
	public ModelRenderer leftLeg00;
	public ModelRenderer rightLeg00;
	public ModelRenderer leftLeg01;
	public ModelRenderer leftHoof01;
	public ModelRenderer leftHoof02;
	public ModelRenderer rightLeg01;
	public ModelRenderer rightHoof01;
	public ModelRenderer rightHoof02;
	public ModelRenderer leftArm01;
	public ModelRenderer rightArm01;
	public ModelRenderer mantleLeft00;
	public ModelRenderer mantleRight00;
	public ModelRenderer mantleLeft01;
	public ModelRenderer mantleRightt01;
	
	public ModelMolochStatue() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.torso = new ModelRenderer(this, 40, 27);
		this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torso.addBox(-5.0F, 0.0F, -3.2F, 10, 9, 7, 0.0F);
		this.snout = new ModelRenderer(this, 30, 0);
		this.snout.setRotationPoint(0.0F, -4.5F, -2.3F);
		this.snout.addBox(-2.5F, -2.15F, -6.6F, 5, 3, 7, 0.0F);
		this.setRotateAngle(snout, 0.3490658503988659F, 0.0F, 0.0F);
		this.mantleLeft00 = new ModelRenderer(this, 86, 37);
		this.mantleLeft00.setRotationPoint(3.5F, -0.8F, 7.5F);
		this.mantleLeft00.addBox(-1.5F, -0.5F, -7.3F, 3, 1, 9, 0.0F);
		this.setRotateAngle(mantleLeft00, 0.0F, -0.17453292519943295F, 0.17453292519943295F);
		this.rightPec = new ModelRenderer(this, 0, 46);
		this.rightPec.mirror = true;
		this.rightPec.setRotationPoint(-3.2F, -5.3F, -2.0F);
		this.rightPec.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 3, 0.0F);
		this.setRotateAngle(rightPec, 0.0F, 0.0F, -0.08726646259971647F);
		this.leftArm00 = new ModelRenderer(this, 71, 0);
		this.leftArm00.setRotationPoint(5.0F, -7.3F, 0.0F);
		this.leftArm00.addBox(-1.3F, -2.0F, -2.4F, 4, 11, 5, 0.0F);
		this.setRotateAngle(leftArm00, -0.08726646259971647F, -0.12217304763960307F, -0.08726646259971647F);
		this.lHorn01 = new ModelRenderer(this, 45, 11);
		this.lHorn01.setRotationPoint(0.0F, -2.6F, 0.1F);
		this.lHorn01.addBox(-1.0F, -2.7F, -1.1F, 2, 3, 2, 0.0F);
		this.setRotateAngle(lHorn01, 0.5235987755982988F, 0.0F, 0.5235987755982988F);
		this.rightArm01 = new ModelRenderer(this, 73, 16);
		this.rightArm01.mirror = true;
		this.rightArm01.setRotationPoint(-0.8F, 8.3F, -0.0F);
		this.rightArm01.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
		this.setRotateAngle(rightArm01, -0.6283185307179586F, -0.12217304763960307F, -0.08726646259971647F);
		this.plith01 = new ModelRenderer(this, 60, 103);
		this.plith01.setRotationPoint(0.0F, 19.0F, 0.0F);
		this.plith01.addBox(-8.5F, 0.0F, -8.5F, 17, 5, 17, 0.0F);
		this.head = new ModelRenderer(this, 0, 2);
		this.head.setRotationPoint(0.0F, -2.0F, -0.8F);
		this.head.addBox(-4.0F, -6.7F, -3.0F, 8, 7, 7, 0.0F);
		this.plith02 = new ModelRenderer(this, 0, 77);
		this.plith02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.plith02.addBox(-7.5F, -11.0F, -7.5F, 15, 11, 15, 0.0F);
		this.lEar01 = new ModelRenderer(this, 54, 5);
		this.lEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.lEar01.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.22759093446006054F);
		this.rHorn03 = new ModelRenderer(this, 59, 11);
		this.rHorn03.mirror = true;
		this.rHorn03.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.rHorn03.addBox(-0.5F, -3.4F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rHorn03, 0.3490658503988659F, 0.0F, 0.3490658503988659F);
		this.leftHoof02 = new ModelRenderer(this, 111, 18);
		this.leftHoof02.mirror = true;
		this.leftHoof02.setRotationPoint(-1.5F, 9.7F, -2.4F);
		this.leftHoof02.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(leftHoof02, 0.6981317007977318F, 0.10471975511965977F, 0.0F);
		this.lEar00 = new ModelRenderer(this, 47, 0);
		this.lEar00.setRotationPoint(3.4F, -4.5F, 0.8F);
		this.lEar00.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
		this.setRotateAngle(lEar00, -0.6981317007977318F, 0.08726646259971647F, 0.3490658503988659F);
		this.rHorn01 = new ModelRenderer(this, 45, 11);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(0.0F, -2.6F, 0.1F);
		this.rHorn01.addBox(-1.0F, -2.7F, -1.1F, 2, 3, 2, 0.0F);
		this.setRotateAngle(rHorn01, 0.5235987755982988F, 0.0F, -0.5235987755982988F);
		this.mantleRight00 = new ModelRenderer(this, 86, 37);
		this.mantleRight00.mirror = true;
		this.mantleRight00.setRotationPoint(-3.5F, -0.8F, 7.5F);
		this.mantleRight00.addBox(-1.5F, -0.5F, -7.3F, 3, 1, 9, 0.0F);
		this.setRotateAngle(mantleRight00, 0.0F, 0.17453292519943295F, -0.17453292519943295F);
		this.rightArm00 = new ModelRenderer(this, 71, 0);
		this.rightArm00.mirror = true;
		this.rightArm00.setRotationPoint(-5.0F, -7.3F, 0.0F);
		this.rightArm00.addBox(-2.7F, -2.0F, -2.4F, 4, 11, 5, 0.0F);
		this.setRotateAngle(rightArm00, -0.08726646259971647F, 0.12217304763960307F, 0.08726646259971647F);
		this.rHorn02c = new ModelRenderer(this, 54, 12);
		this.rHorn02c.mirror = true;
		this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02c.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.lHorn02b = new ModelRenderer(this, 54, 12);
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.2F, -3.0F, -0.79F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn02b, 0.0F, -1.5707963267948966F, 0.0F);
		this.chest = new ModelRenderer(this, 0, 26);
		this.chest.setRotationPoint(0.0F, -0.8F, 2.7F);
		this.chest.addBox(-5.5F, -9.0F, -4.0F, 11, 9, 8, 0.0F);
		this.lHorn03 = new ModelRenderer(this, 59, 11);
		this.lHorn03.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.lHorn03.addBox(-0.5F, -3.4F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lHorn03, 0.3490658503988659F, 0.0F, -0.3490658503988659F);
		this.lHorn02a = new ModelRenderer(this, 54, 12);
		this.lHorn02a.setRotationPoint(-0.1F, -2.2F, 0.1F);
		this.lHorn02a.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn02a, 0.4363323129985824F, 0.13962634015954636F, 0.5235987755982988F);
		this.lHorn02d = new ModelRenderer(this, 54, 12);
		this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02d.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.leftArm01 = new ModelRenderer(this, 73, 16);
		this.leftArm01.setRotationPoint(0.8F, 8.3F, -0.0F);
		this.leftArm01.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
		this.setRotateAngle(leftArm01, -0.6283185307179586F, 0.12217304763960307F, 0.08726646259971647F);
		this.lHorn00 = new ModelRenderer(this, 45, 12);
		this.lHorn00.setRotationPoint(2.7F, -5.9F, 2.0F);
		this.lHorn00.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(lHorn00, -0.2617993877991494F, 1.0471975511965976F, 0.5759586531581287F);
		this.rEar01 = new ModelRenderer(this, 54, 5);
		this.rEar01.mirror = true;
		this.rEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.rEar01.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.22759093446006054F);
		this.mantleLeft01 = new ModelRenderer(this, 112, 28);
		this.mantleLeft01.setRotationPoint(0.0F, 0.5F, -7.2F);
		this.mantleLeft01.addBox(-1.5F, -0.8F, -0.4F, 2, 4, 1, 0.0F);
		this.setRotateAngle(mantleLeft01, -0.13962634015954636F, 0.0F, 0.0F);
		this.loinclothFront = new ModelRenderer(this, 51, 47);
		this.loinclothFront.setRotationPoint(0.0F, 6.7F, -5.4F);
		this.loinclothFront.addBox(-5.0F, 0.0F, -0.5F, 10, 8, 7, 0.0F);
		this.setRotateAngle(loinclothFront, -1.5707963267948966F, 0.0F, 0.0F);
		this.rightLeg01 = new ModelRenderer(this, 94, 18);
		this.rightLeg01.mirror = true;
		this.rightLeg01.setRotationPoint(0.7F, 11.5F, 0.4F);
		this.rightLeg01.addBox(-2.5F, 0.0F, -2.5F, 4, 10, 4, 0.0F);
		this.setRotateAngle(rightLeg01, 1.48352986419518F, 0.0F, -0.06981317007977318F);
		this.rHorn02a = new ModelRenderer(this, 54, 12);
		this.rHorn02a.mirror = true;
		this.rHorn02a.setRotationPoint(0.1F, -2.2F, 0.1F);
		this.rHorn02a.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn02a, 0.4363323129985824F, 0.0F, -0.5235987755982988F);
		this.rHorn02b = new ModelRenderer(this, 54, 12);
		this.rHorn02b.mirror = true;
		this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02b.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.rightHoof02 = new ModelRenderer(this, 111, 18);
		this.rightHoof02.mirror = true;
		this.rightHoof02.setRotationPoint(-1.5F, 9.7F, -2.4F);
		this.rightHoof02.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(rightHoof02, 0.6981317007977318F, 0.10471975511965977F, 0.0F);
		this.upperJaw = new ModelRenderer(this, 0, 16);
		this.upperJaw.mirror = true;
		this.upperJaw.setRotationPoint(0.0F, -3.4F, -2.3F);
		this.upperJaw.addBox(-3.0F, -0.65F, -6.8F, 6, 3, 7, 0.0F);
		this.belly = new ModelRenderer(this, 18, 43);
		this.belly.setRotationPoint(0.0F, 3.4F, -2.1F);
		this.belly.addBox(-5.51F, -5.0F, -2.9F, 11, 10, 5, 0.0F);
		this.setRotateAngle(belly, -0.10471975511965977F, 0.0F, 0.0F);
		this.lowerJaw = new ModelRenderer(this, 25, 11);
		this.lowerJaw.setRotationPoint(0.0F, -1.0F, -2.9F);
		this.lowerJaw.addBox(-2.5F, -0.1F, -5.8F, 5, 1, 6, 0.0F);
		this.setRotateAngle(lowerJaw, -0.03490658503988659F, 0.0F, 0.0F);
		this.leftLeg01 = new ModelRenderer(this, 94, 18);
		this.leftLeg01.setRotationPoint(0.7F, 11.5F, 0.4F);
		this.leftLeg01.addBox(-2.5F, 0.0F, -2.5F, 4, 10, 4, 0.0F);
		this.setRotateAngle(leftLeg01, 1.48352986419518F, 0.0F, 0.06981317007977318F);
		this.mantle00 = new ModelRenderer(this, 76, 35);
		this.mantle00.setRotationPoint(0.0F, -8.7F, -5.1F);
		this.mantle00.addBox(-4.5F, -0.4F, 0.0F, 9, 8, 0, 0.0F);
		this.leftLeg00 = new ModelRenderer(this, 94, 0);
		this.leftLeg00.setRotationPoint(2.9F, 8.2F, 0.7F);
		this.leftLeg00.addBox(-2.5F, 0.0F, -2.5F, 5, 12, 5, 0.0F);
		this.setRotateAngle(leftLeg00, -1.48352986419518F, -0.06981317007977318F, 0.0F);
		this.leftHoof01 = new ModelRenderer(this, 111, 18);
		this.leftHoof01.setRotationPoint(0.5F, 9.7F, -2.4F);
		this.leftHoof01.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(leftHoof01, 0.6981317007977318F, -0.10471975511965977F, 0.0F);
		this.neck = new ModelRenderer(this, 32, 18);
		this.neck.setRotationPoint(0.0F, -8.9F, 0.0F);
		this.neck.addBox(-3.6F, -2.9F, -3.4F, 7, 3, 6, 0.0F);
		this.lHorn02c = new ModelRenderer(this, 54, 12);
		this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02c.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.rightLeg00 = new ModelRenderer(this, 94, 0);
		this.rightLeg00.mirror = true;
		this.rightLeg00.setRotationPoint(-2.9F, 8.2F, 0.7F);
		this.rightLeg00.addBox(-2.5F, 0.0F, -2.5F, 5, 12, 5, 0.0F);
		this.setRotateAngle(rightLeg00, -1.48352986419518F, 0.06981317007977318F, 0.0F);
		this.rHorn00 = new ModelRenderer(this, 45, 12);
		this.rHorn00.mirror = true;
		this.rHorn00.setRotationPoint(-2.7F, -5.9F, 2.0F);
		this.rHorn00.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(rHorn00, -0.2617993877991494F, -1.0471975511965976F, -0.5759586531581287F);
		this.mantleRightt01 = new ModelRenderer(this, 112, 28);
		this.mantleRightt01.mirror = true;
		this.mantleRightt01.setRotationPoint(0.0F, 0.5F, -7.2F);
		this.mantleRightt01.addBox(-0.5F, -0.8F, -0.4F, 2, 4, 1, 0.0F);
		this.setRotateAngle(mantleRightt01, -0.13962634015954636F, 0.0F, 0.0F);
		this.leftPec = new ModelRenderer(this, 0, 46);
		this.leftPec.setRotationPoint(3.2F, -5.3F, -2.0F);
		this.leftPec.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 3, 0.0F);
		this.setRotateAngle(leftPec, 0.0F, 0.0F, 0.08726646259971647F);
		this.rHorn02d = new ModelRenderer(this, 54, 12);
		this.rHorn02d.mirror = true;
		this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02d.addBox(-0.8F, -3.0F, -0.79F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn02d, 0.0F, 1.5707963267948966F, 0.0F);
		this.rEar00 = new ModelRenderer(this, 47, 0);
		this.rEar00.mirror = true;
		this.rEar00.setRotationPoint(-3.4F, -4.5F, 0.8F);
		this.rEar00.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
		this.setRotateAngle(rEar00, -0.6981317007977318F, 0.08726646259971647F, -0.3490658503988659F);
		this.rightHoof01 = new ModelRenderer(this, 111, 18);
		this.rightHoof01.setRotationPoint(0.5F, 9.7F, -2.4F);
		this.rightHoof01.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(rightHoof01, 0.6981317007977318F, -0.10471975511965977F, 0.0F);
		this.chest.addChild(this.torso);
		this.head.addChild(this.snout);
		this.mantle00.addChild(this.mantleLeft00);
		this.chest.addChild(this.rightPec);
		this.chest.addChild(this.leftArm00);
		this.lHorn00.addChild(this.lHorn01);
		this.rightArm00.addChild(this.rightArm01);
		this.neck.addChild(this.head);
		this.plith01.addChild(this.plith02);
		this.lEar00.addChild(this.lEar01);
		this.rHorn02a.addChild(this.rHorn03);
		this.leftLeg01.addChild(this.leftHoof02);
		this.head.addChild(this.lEar00);
		this.rHorn00.addChild(this.rHorn01);
		this.mantle00.addChild(this.mantleRight00);
		this.chest.addChild(this.rightArm00);
		this.rHorn02a.addChild(this.rHorn02c);
		this.lHorn02a.addChild(this.lHorn02b);
		this.lHorn02a.addChild(this.lHorn03);
		this.lHorn01.addChild(this.lHorn02a);
		this.lHorn02a.addChild(this.lHorn02d);
		this.leftArm00.addChild(this.leftArm01);
		this.head.addChild(this.lHorn00);
		this.rEar00.addChild(this.rEar01);
		this.mantleLeft00.addChild(this.mantleLeft01);
		this.torso.addChild(this.loinclothFront);
		this.rightLeg00.addChild(this.rightLeg01);
		this.rHorn01.addChild(this.rHorn02a);
		this.rHorn02a.addChild(this.rHorn02b);
		this.rightLeg01.addChild(this.rightHoof02);
		this.head.addChild(this.upperJaw);
		this.torso.addChild(this.belly);
		this.head.addChild(this.lowerJaw);
		this.leftLeg00.addChild(this.leftLeg01);
		this.chest.addChild(this.mantle00);
		this.torso.addChild(this.leftLeg00);
		this.leftLeg01.addChild(this.leftHoof01);
		this.chest.addChild(this.neck);
		this.lHorn02a.addChild(this.lHorn02c);
		this.torso.addChild(this.rightLeg00);
		this.head.addChild(this.rHorn00);
		this.mantleRight00.addChild(this.mantleRightt01);
		this.chest.addChild(this.leftPec);
		this.rHorn02a.addChild(this.rHorn02d);
		this.head.addChild(this.rEar00);
		this.rightLeg01.addChild(this.rightHoof01);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.plith01.render(f5);
		this.chest.render(f5);
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