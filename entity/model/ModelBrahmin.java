package mini.fallout.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBrahmin extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer udders;
    public ModelRenderer rearlegleft;
    public ModelRenderer frontlegleft;
    public ModelRenderer rearlegright;
    public ModelRenderer frontlegright;
    public ModelRenderer head1;
    public ModelRenderer horn2right;
    public ModelRenderer horn1left;
    public ModelRenderer head2;
    public ModelRenderer horn3left;
    public ModelRenderer horn4right;

    public ModelBrahmin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 18, 4);
        this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.horn4right = new ModelRenderer(this, 22, 0);
        this.horn4right.setRotationPoint(-5.0F, 4.0F, -8.0F);
        this.horn4right.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn4right, 0.0F, 0.2617993877991494F, 0.0F);
        this.rearlegleft = new ModelRenderer(this, 0, 16);
        this.rearlegleft.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.rearlegleft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.horn3left = new ModelRenderer(this, 22, 0);
        this.horn3left.setRotationPoint(-5.0F, 4.0F, -8.0F);
        this.horn3left.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn3left, 0.0F, 0.2617993877991494F, 0.0F);
        this.udders = new ModelRenderer(this, 52, 0);
        this.udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.frontlegleft = new ModelRenderer(this, 0, 16);
        this.frontlegleft.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.frontlegleft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.setRotationPoint(-5.0F, 4.0F, -8.0F);
        this.head2.addBox(-4.0F, -3.9F, -6.0F, 8, 8, 6, 0.0F);
        this.setRotateAngle(head2, 0.0F, 0.2617993877991494F, 0.0F);
        this.horn1left = new ModelRenderer(this, 22, 0);
        this.horn1left.setRotationPoint(5.0F, 4.0F, -8.0F);
        this.horn1left.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn1left, 0.0F, -0.2617993877991494F, 0.0F);
        this.horn2right = new ModelRenderer(this, 22, 0);
        this.horn2right.setRotationPoint(5.0F, 4.0F, -8.0F);
        this.horn2right.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn2right, 0.0F, -0.2617993877991494F, 0.0F);
        this.head1 = new ModelRenderer(this, 0, 0);
        this.head1.setRotationPoint(5.0F, 4.0F, -8.0F);
        this.head1.addBox(-4.0F, -3.9F, -6.0F, 8, 8, 6, 0.0F);
        this.setRotateAngle(head1, 0.0F, -0.2617993877991494F, 0.0F);
        this.rearlegright = new ModelRenderer(this, 0, 16);
        this.rearlegright.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.rearlegright.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.frontlegright = new ModelRenderer(this, 0, 16);
        this.frontlegright.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.frontlegright.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
        this.horn4right.render(f5);
        this.rearlegleft.render(f5);
        this.horn3left.render(f5);
        this.udders.render(f5);
        this.frontlegleft.render(f5);
        this.head2.render(f5);
        this.horn1left.render(f5);
        this.horn2right.render(f5);
        this.head1.render(f5);
        this.rearlegright.render(f5);
        this.frontlegright.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
  	{
	  this.frontlegleft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	  this.rearlegleft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	  this.frontlegright.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	  this.rearlegright.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	  this.head1.rotateAngleY = netHeadYaw * 0.017453292F;
	  this.head1.rotateAngleX = headPitch * 0.017453292F;
	  this.horn1left.rotateAngleY = netHeadYaw * 0.017453292F;
	  this.horn2right.rotateAngleX = headPitch * 0.017453292F;
	  this.head2.rotateAngleY = netHeadYaw * 0.017453292F;
	  this.head2.rotateAngleX = headPitch * 0.017453292F;
	  this.horn4right.rotateAngleY = netHeadYaw * 0.017453292F;
	  this.horn3left.rotateAngleX = headPitch * 0.017453292F;
  	}
}
