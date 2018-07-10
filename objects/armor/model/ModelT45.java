package mini.fallout.objects.armor.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelT45 extends ModelBiped 
{
    private ModelRenderer head;
    private ModelRenderer filter;

    public ModelT45() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.filter = new ModelRenderer(this, 41, 5);
        this.filter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.filter.addBox(-1.5F, -2.5F, -7.5F, 3, 3, 3, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.5F, -8.5F, -4.5F, 9, 9, 9, 0.0F);
        bipedHead.addChild(head);
        bipedHead.addChild(filter);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.filter.render(f5);
        this.head.render(f5);
    }
}

