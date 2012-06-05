// Date: 23/05/2012 15:33:04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelRabbit extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Tail;
    ModelRenderer backlegleft;
    ModelRenderer backlegright;
    ModelRenderer frontleg_right;
    ModelRenderer frontleg_left;
    ModelRenderer head;
    ModelRenderer Ear1;
    ModelRenderer ear2;
  
  public ModelRabbit()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 9);
      Body.addBox(0F, 0F, 0F, 6, 6, 11);
      Body.setRotationPoint(-3F, 16F, -5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 27);
      Tail.addBox(0F, 0F, 0F, 4, 4, 2);
      Tail.setRotationPoint(-2F, 17F, 6F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      backlegleft = new ModelRenderer(this, 24, 9);
      backlegleft.addBox(0F, 0F, 0F, 2, 6, 4);
      backlegleft.setRotationPoint(2F, 18F, 2F);
      backlegleft.setTextureSize(64, 32);
      backlegleft.mirror = true;
      setRotation(backlegleft, 0F, 0F, 0F);
      backlegright = new ModelRenderer(this, 24, 9);
      backlegright.addBox(-1F, 0F, 0F, 2, 6, 4);
      backlegright.setRotationPoint(-3F, 18F, 2F);
      backlegright.setTextureSize(64, 32);
      backlegright.mirror = true;
      setRotation(backlegright, 0F, 0F, 0F);
      frontleg_right = new ModelRenderer(this, 24, 0);
      frontleg_right.addBox(-1F, 0F, -1F, 2, 4, 2);
      frontleg_right.setRotationPoint(-2F, 20F, -4F);
      frontleg_right.setTextureSize(64, 32);
      frontleg_right.mirror = true;
      setRotation(frontleg_right, 0F, 0F, 0F);
      frontleg_left = new ModelRenderer(this, 24, 0);
      frontleg_left.addBox(0F, 0F, 0F, 2, 4, 2);
      frontleg_left.setRotationPoint(1F, 20F, -5F);
      frontleg_left.setTextureSize(64, 32);
      frontleg_left.mirror = true;
      setRotation(frontleg_left, 0F, 0F, 0F);
      head = new ModelRenderer(this, 7, 0);
      head.addBox(0F, 0F, 0F, 4, 4, 4);
      head.setRotationPoint(-2F, 15F, -8F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 0, 0);
      Ear1.addBox(0F, 0F, 0F, 1, 3, 2);
      Ear1.setRotationPoint(0.5F, 12F, -6F);
      Ear1.setTextureSize(64, 32);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0.2617994F, 0F);
      ear2 = new ModelRenderer(this, 0, 0);
      ear2.addBox(-1F, 0F, 0F, 1, 3, 2);
      ear2.setRotationPoint(-0.5F, 12F, -6F);
      ear2.setTextureSize(64, 32);
      ear2.mirror = true;
      setRotation(ear2, 0F, -0.2617994F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Tail.render(f5);
    backlegleft.render(f5);
    backlegright.render(f5);
    frontleg_right.render(f5);
    frontleg_left.render(f5);
    head.render(f5);
    Ear1.render(f5);
    ear2.render(f5);
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