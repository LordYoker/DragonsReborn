// Date: 25/03/2012 17:36:04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelMudcrab extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer clawarm2;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer clawarm1;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
    ModelRenderer claw1left;
    ModelRenderer claw2left;
    ModelRenderer claw1right;
    ModelRenderer claw2right;
  
  public ModelMudcrab()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -4F, -3F, 8, 7, 3);
      Head.setRotationPoint(0F, 19F, -2F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0.5576792F, 0F, 0F);
      Body = new ModelRenderer(this, 23, 0);
      Body.addBox(-3F, -3F, -3F, 8, 6, 6);
      Body.setRotationPoint(-1F, 20F, 0F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 46);
      body2.addBox(-5F, -4F, -6F, 14, 4, 14);
      body2.setRotationPoint(-2F, 20F, 0F);
      body2.setTextureSize(128, 64);
      body2.mirror = true;
      setRotation(body2, -0.2974289F, 0F, 0F);
      body3 = new ModelRenderer(this, 0, 31);
      body3.addBox(0F, 0F, 0F, 10, 6, 9);
      body3.setRotationPoint(-5F, 12F, -2F);
      body3.setTextureSize(128, 64);
      body3.mirror = true;
      setRotation(body3, -0.1858931F, 0F, 0F);
      body4 = new ModelRenderer(this, 0, 22);
      body4.addBox(0F, 0F, 0F, 4, 4, 5);
      body4.setRotationPoint(-2F, 10F, 0F);
      body4.setTextureSize(128, 64);
      body4.mirror = true;
      setRotation(body4, -0.1115358F, 0F, 0F);
      clawarm2 = new ModelRenderer(this, 54, 0);
      clawarm2.addBox(-1F, -1F, -1F, 12, 3, 2);
      clawarm2.setRotationPoint(4F, 18F, -2F);
      clawarm2.setTextureSize(128, 64);
      clawarm2.mirror = true;
      setRotation(clawarm2, 0.0349066F, 0.5759587F, -0.1745329F);
      Leg6 = new ModelRenderer(this, 54, 8);
      Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg6.setRotationPoint(4F, 20F, 0F);
      Leg6.setTextureSize(128, 64);
      Leg6.mirror = true;
      setRotation(Leg6, 0F, 0.2792527F, 0.1919862F);
      Leg4 = new ModelRenderer(this, 54, 8);
      Leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg4.setRotationPoint(4F, 20F, 1F);
      Leg4.setTextureSize(128, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, -0.2792527F, 0.1919862F);
      Leg2 = new ModelRenderer(this, 54, 8);
      Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg2.setRotationPoint(4F, 20F, 2F);
      Leg2.setTextureSize(128, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
      clawarm1 = new ModelRenderer(this, 54, 0);
      clawarm1.addBox(-11F, -1F, -1F, 12, 3, 2);
      clawarm1.setRotationPoint(-4F, 18F, -2F);
      clawarm1.setTextureSize(128, 64);
      clawarm1.mirror = true;
      setRotation(clawarm1, -0.0349066F, -0.5759587F, 0.1745329F);
      Leg5 = new ModelRenderer(this, 54, 8);
      Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg5.setRotationPoint(-4F, 20F, 0F);
      Leg5.setTextureSize(128, 64);
      Leg5.mirror = true;
      setRotation(Leg5, 0F, -0.2792527F, -0.1919862F);
      Leg3 = new ModelRenderer(this, 54, 8);
      Leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg3.setRotationPoint(-4F, 20F, 1F);
      Leg3.setTextureSize(128, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0.2792527F, -0.1919862F);
      Leg1 = new ModelRenderer(this, 54, 8);
      Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg1.setRotationPoint(-4F, 20F, 2F);
      Leg1.setTextureSize(128, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
      claw1left = new ModelRenderer(this, 54, 15);
      claw1left.addBox(-1F, 0F, -7F, 2, 3, 7);
      claw1left.setRotationPoint(13F, 15F, -6F);
      claw1left.setTextureSize(128, 64);
      claw1left.mirror = true;
      setRotation(claw1left, -0.2974289F, -0.1487144F, -0.1115358F);
      claw2left = new ModelRenderer(this, 34, 16);
      claw2left.addBox(-0.5F, 0F, -5F, 1, 1, 5);
      claw2left.setRotationPoint(13.5F, 17F, -7F);
      claw2left.setTextureSize(128, 64);
      claw2left.mirror = true;
      setRotation(claw2left, 0.0371786F, -0.0371786F, -0.1858931F);
      claw1right = new ModelRenderer(this, 54, 15);
      claw1right.addBox(-1F, 0F, -7F, 2, 3, 7);
      claw1right.setRotationPoint(-13F, 15F, -6F);
      claw1right.setTextureSize(128, 64);
      claw1right.mirror = true;
      setRotation(claw1right, -0.2974216F, 0.1487195F, 0.111544F);
      claw2right = new ModelRenderer(this, 34, 16);
      claw2right.addBox(-0.5F, 0F, -5F, 1, 1, 5);
      claw2right.setRotationPoint(-13.5F, 17F, -7F);
      claw2right.setTextureSize(128, 64);
      claw2right.mirror = true;
      setRotation(claw2right, 0.0371755F, 0.0371755F, 0.185895F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Body.render(f5);
    body2.render(f5);
    body3.render(f5);
    body4.render(f5);
    clawarm2.render(f5);
    Leg6.render(f5);
    Leg4.render(f5);
    Leg2.render(f5);
    clawarm1.render(f5);
    Leg5.render(f5);
    Leg3.render(f5);
    Leg1.render(f5);
    claw1left.render(f5);
    claw2left.render(f5);
    claw1right.render(f5);
    claw2right.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}